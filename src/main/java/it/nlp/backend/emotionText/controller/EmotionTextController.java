package it.nlp.backend.emotionText.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.nlp.backend.emotionText.controller.swagger.EmotionTextSwaggerSample;
import it.nlp.backend.emotionText.dto.EmotionTextOutput;
import it.nlp.backend.emotionText.service.EmotionTextService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Tag(name = "Emotion text")
@RequestMapping("/api/v1/emotion-texts")
@SecurityRequirement(name = "Bearer Authentication")
class EmotionTextController {
    private final EmotionTextService emotionTextService;

    EmotionTextController(EmotionTextService emotionTextService) {
        this.emotionTextService = emotionTextService;
    }

    @GetMapping("/youtube/trending")
    @PreAuthorize("hasAuthority('ADMIN')")
    @Operation(summary = "Fetch comments from trending YouTube videos")
    ResponseEntity<List<EmotionTextOutput>> fetchYTEmotionTextsFromPopularVideos() {
        return ResponseEntity.ok(emotionTextService.fetchYTCommentsFromPopularVideos());
    }

    @GetMapping("/youtube/channels")
    @PreAuthorize("hasAuthority('ADMIN')")
    @Operation(summary = "Fetch comments from videos of saved YouTube channels")
    ResponseEntity<List<EmotionTextOutput>> fetchYTEmotionTextsFromVideosOfSavedChannels() {
        return ResponseEntity.ok(emotionTextService.fetchYTCommentsFromVideosOfSavedChannels());
    }

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ADMIN')")
    @Operation(summary = "Fetch list of emotion texts from the database (with pagination)")
    ResponseEntity<Page<EmotionTextOutput>> fetchEmotionTexts(
            @Parameter(example = EmotionTextSwaggerSample.PAGEABLE_EXAMPLE)
            Pageable pageable) {
        return ResponseEntity.ok(emotionTextService.fetchEmotionTexts(pageable));
    }

    @GetMapping
    @PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
    @Operation(summary = "Fetch emotion texts to be assigned by the user with userId")
    ResponseEntity<List<EmotionTextOutput>> fetchEmotionTextsToBeAssigned(
            Authentication authentication,
            @RequestParam(name = "emotionTextsNumber") String emotionTextsNumber) {
        String userEmail = authentication.getName();
        return ResponseEntity.ok(emotionTextService.fetchEmotionTextsToBeAssigned(userEmail, emotionTextsNumber));
    }
}
