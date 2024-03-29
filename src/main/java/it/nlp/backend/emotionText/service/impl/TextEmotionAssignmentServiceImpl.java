package it.nlp.backend.emotionText.service.impl;

import it.nlp.backend.authentication.model.User;
import it.nlp.backend.authentication.repository.UserRepository;
import it.nlp.backend.emotionText.dto.TextEmotionAssignmentInput;
import it.nlp.backend.emotionText.dto.TextEmotionAssignmentOutput;
import it.nlp.backend.emotionText.dto.TextEmotionAssignmentsNumberOutput;
import it.nlp.backend.emotionText.model.Emotion;
import it.nlp.backend.emotionText.model.EmotionText;
import it.nlp.backend.emotionText.repository.EmotionTextRepository;
import it.nlp.backend.emotionText.service.TextEmotionAssignmentService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.io.Writer;
import java.util.*;

import static it.nlp.backend.exception.messages.SecurityExceptionMessages.NO_USER_WITH_PASSED_EMAIL;
import static it.nlp.backend.exception.messages.TextEmotionAssignmentExceptionMessages.*;
import static it.nlp.backend.exception.messages.TextExceptionMessages.NO_TEXT_WITH_ENTERED_ID;

@Service
public class TextEmotionAssignmentServiceImpl implements TextEmotionAssignmentService {

    private final UserRepository userRepository;
    private final EmotionTextRepository textRepository;
    private final TextEmotionAssignmentMapper textEmotionAssignmentMapper;

    TextEmotionAssignmentServiceImpl(UserRepository userRepository,
                                     EmotionTextRepository textRepository) {
        this.userRepository = userRepository;
        this.textRepository = textRepository;
        this.textEmotionAssignmentMapper = new TextEmotionAssignmentMapper();
    }

    @Override
    @Transactional
    public List<TextEmotionAssignmentOutput> postTextEmotionAssignments(String userEmail,
                                                                        List<TextEmotionAssignmentInput> assignmentInputs) {
        List<TextEmotionAssignmentOutput> assignmentOutputs = new ArrayList<>();

        assignmentInputs.forEach(assignmentInput -> processAssignmentInput(assignmentOutputs, userEmail, assignmentInput));

        return assignmentOutputs;
    }

    @Override
    public TextEmotionAssignmentsNumberOutput getNumberOfTextEmotionAssignmentsForUser(String userEmail) {
        User user = userRepository.findByEmail(userEmail).orElseThrow(
                () -> new IllegalStateException(NO_USER_WITH_PASSED_EMAIL.getMessage() + userEmail));

        return TextEmotionAssignmentsNumberOutput.builder()
                .assignmentsCount(user.getAssignedEmotionTextIds().size())
                .build();
    }

    @Override
    public void generateTextEmotionAssignmentsDataset(HttpServletResponse servletResponse) {
        configureResponse(servletResponse);

        Map<String, Emotion> textToEmotionMap = getAssignmentsToExport();

        try (Writer writer = servletResponse.getWriter();
             CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)) {

            csvPrinter.printRecord("emotionTextContent", "emotion");
            for (Map.Entry<String, Emotion> entry : textToEmotionMap.entrySet()) {
                csvPrinter.printRecord(entry.getKey(), entry.getValue());
            }

        } catch (IOException e) {
            throw new RuntimeException(FAILED_TO_WRITE_CSV.getMessage());
        }
    }

    private void processAssignmentInput(
            List<TextEmotionAssignmentOutput> assignmentOutputs,
            String userEmail,
            TextEmotionAssignmentInput assignmentInput) {
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new NoSuchElementException(NO_USER_WITH_PASSED_EMAIL.getMessage() + userEmail));
        Emotion emotion = getEnumFrom(assignmentInput.emotion());

        EmotionText emotionText = getEmotionText(assignmentInput);

        checkIfAssignmentExists(user.getAssignedEmotionTextIds(), emotionText.getEmotionTextId());
        user.getAssignedEmotionTextIds().add(emotionText.getEmotionTextId());
        emotionText.getAssignedEmotions().add(emotion);

        textRepository.save(emotionText);
        userRepository.save(user);

        assignmentOutputs.add(
                textEmotionAssignmentMapper.mapToTextEmotionAssignmentOutput(
                        user.getUserId(), emotionText.getEmotionTextId(), emotion));
    }

    private Emotion getEnumFrom(String emotion) {
        if (!Emotion.contains(emotion)) {
            throw new IllegalArgumentException(WRONG_EMOTION.getMessage() + emotion);
        }
        return Emotion.valueOf(emotion);
    }

    private EmotionText getEmotionText(TextEmotionAssignmentInput assignmentInput) {
        UUID textId = UUID.fromString(assignmentInput.textId());
        return textRepository.findById(textId)
                .orElseThrow(() -> new IllegalArgumentException(NO_TEXT_WITH_ENTERED_ID.getMessage() + textId));
    }

    private void checkIfAssignmentExists(List<UUID> userAssignedEmotionTexts, UUID emotionTextId) {
        if (userAssignedEmotionTexts.contains(emotionTextId)) {
            throw new IllegalArgumentException(ASSIGNMENT_ALREADY_EXISTS.getMessage() + emotionTextId);
        }
    }

    private void configureResponse(HttpServletResponse servletResponse) {
        servletResponse.setContentType("text/csv");
        servletResponse.setCharacterEncoding("UTF-8");
        servletResponse.addHeader("Content-Disposition", "attachment; filename=\"assignments-dataset.csv\"");
    }

    private Map<String, Emotion> getAssignmentsToExport() {
        List<EmotionText> emotionTextsWithValidAssignments = textRepository.findAll().stream()
                .map(emotionText -> {
                    var filteredAssignedEmotions = emotionText.getAssignedEmotions().stream()
                            .filter(emotion -> !emotion.equals(Emotion.UNSPECIFIABLE)).toList();

                    return EmotionText.builder()
                            .emotionTextId(emotionText.getEmotionTextId())
                            .createdAt(emotionText.getCreatedAt())
                            .content(emotionText.getContent())
                            .originalSourceId(emotionText.getOriginalSourceId())
                            .assignedEmotions(filteredAssignedEmotions)
                            .build();
                })
                .filter(emotionText -> !emotionText.getAssignedEmotions().isEmpty())
                .toList();

        return mapToTextContentToMostFrequentEmotionMap(emotionTextsWithValidAssignments);
    }

    private Map<String, Emotion> mapToTextContentToMostFrequentEmotionMap(List<EmotionText> emotionTexts) {
        Map<String, Emotion> textContentToMostFrequentEmotionMap = new HashMap<>();

        emotionTexts.forEach(emotionText ->
                textContentToMostFrequentEmotionMap.put(
                        emotionText.getContent(),
                        getMostFrequentEmotion(emotionText.getAssignedEmotions()))
        );
        return textContentToMostFrequentEmotionMap;
    }

    private Emotion getMostFrequentEmotion(List<Emotion> emotions) {
        Map<Emotion, Integer> emotionToEmotionsNumberMap =
                new HashMap<>();

        emotions.forEach(emotion -> {
            if (emotionToEmotionsNumberMap.containsKey(emotion)) {
                int number = emotionToEmotionsNumberMap.get(emotion);
                number++;
                emotionToEmotionsNumberMap.put(emotion, number);
            } else {
                emotionToEmotionsNumberMap.put(emotion, 1);
            }
        });

        int maxCount = 0;
        Emotion emotion = null;

        for (Map.Entry<Emotion, Integer> entry : emotionToEmotionsNumberMap.entrySet()) {
            if (maxCount < entry.getValue()) {
                emotion = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return emotion;
    }
}
