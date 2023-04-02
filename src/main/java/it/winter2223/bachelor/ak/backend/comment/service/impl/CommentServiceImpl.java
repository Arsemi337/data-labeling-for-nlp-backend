package it.winter2223.bachelor.ak.backend.comment.service.impl;

import it.winter2223.bachelor.ak.backend.authentication.exception.FirebaseAuthenticationException;
import it.winter2223.bachelor.ak.backend.authentication.repository.UserRepository;
import it.winter2223.bachelor.ak.backend.comment.dto.CommentOutput;
import it.winter2223.bachelor.ak.backend.comment.exception.CommentException;
import it.winter2223.bachelor.ak.backend.comment.model.Comment;
import it.winter2223.bachelor.ak.backend.comment.repository.CommentRepository;
import it.winter2223.bachelor.ak.backend.comment.service.CommentService;
import it.winter2223.bachelor.ak.backend.comment.service.InternetCommentService;
import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.model.CommentEmotionAssignment;
import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.repository.CommentEmotionAssignmentRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;

import static it.winter2223.bachelor.ak.backend.authentication.exception.FirebaseAuthenticationExceptionMessages.NO_USER_WITH_PASSED_ID;
import static it.winter2223.bachelor.ak.backend.comment.exception.CommentExceptionMessages.COMMENTS_NUMBER_IS_NOT_INTEGER;
import static it.winter2223.bachelor.ak.backend.comment.exception.CommentExceptionMessages.COMMENTS_NUMBER_OUT_OF_RANGE;

@Service
class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final CommentEmotionAssignmentRepository assignmentRepository;
    private final UserRepository userRepository;
    private final InternetCommentService internetCommentService;
    private final CommentMapper commentMapper;

    CommentServiceImpl(CommentRepository commentRepository,
                       CommentEmotionAssignmentRepository assignmentRepository,
                       UserRepository userRepository,
                       InternetCommentService internetCommentService) {
        this.commentRepository = commentRepository;
        this.assignmentRepository = assignmentRepository;
        this.userRepository = userRepository;
        this.internetCommentService = internetCommentService;
        this.commentMapper = new CommentMapper();
    }

    @Override
    public List<CommentOutput> fetchYTComments() {
        List<Comment> comments;
        List<CommentOutput> commentOutputList = new ArrayList<>();

        comments = internetCommentService.fetchInternetComments();

        comments.forEach(c -> commentOutputList.add(commentMapper.mapToCommentOutput(commentRepository.save(c))));
        return commentOutputList;

    }

    @Override
    public Page<CommentOutput> fetchCommentsList(Pageable pageable) {
        return commentRepository.findAll(pageable)
                .map(commentMapper::mapToCommentOutput);
    }

    @Override
    public List<CommentOutput> fetchCommentsToBeAssigned(String userId, String commentsNumber) {
        validateUserId(userId);
        int commentsNumberInt = ParseCommentsNumber(commentsNumber);

        List<String> userAssignedCommentsIds = getIdsOfCommentsAssignedByUser(userId);

        List<Comment> notAssignedComments = getCommentsNotAssignedByUser(userAssignedCommentsIds);

        Collections.sort(notAssignedComments);

        List<Comment> commentsSublist = getCommentsSublist(notAssignedComments, commentsNumberInt);

        List<CommentOutput> commentsToBeAssigned = new ArrayList<>();
        commentsSublist.forEach(comment -> commentsToBeAssigned.add(commentMapper.mapToCommentOutput(comment)));

        return commentsToBeAssigned;
    }

    private int ParseCommentsNumber(String commentsNumber) {
        int number;
        try {
            number = Integer.parseInt(commentsNumber);
        } catch (NumberFormatException e) {
            throw new CommentException(COMMENTS_NUMBER_IS_NOT_INTEGER.getMessage(), e);
        }
        if (number < 1 || number > 100) {
            throw new CommentException(COMMENTS_NUMBER_OUT_OF_RANGE.getMessage());
        }
        return number;
    }

    private void validateUserId(String userId) {
        if (!userRepository.existsById(userId)) {
            throw new FirebaseAuthenticationException(NO_USER_WITH_PASSED_ID.getMessage());
        }
    }

    private List<String> getIdsOfCommentsAssignedByUser(String userId) {
        List<CommentEmotionAssignment> assignments = assignmentRepository.findByUserId(userId);
        List<String> userAssignedCommentsIds = new ArrayList<>();
        assignments.forEach(assignment -> userAssignedCommentsIds.add(assignment.getCommentId()));
        return userAssignedCommentsIds;
    }

    private List<Comment> getCommentsNotAssignedByUser(List<String> userAssignedCommentsIds) {
        return new ArrayList<>(commentRepository.findAll().stream()
                .filter(comment -> !userAssignedCommentsIds.contains(comment.getCommentId())).toList());
    }

    private static List<Comment> getCommentsSublist(List<Comment> notAssignedComments, int commentsNumber) {
        List<Comment> commentsSublist = new ArrayList<>();
        int elementsNumber = Math.min(notAssignedComments.size(), commentsNumber);
        if (elementsNumber > 0) {
            commentsSublist = notAssignedComments.subList(0, elementsNumber);
        }
        return commentsSublist;
    }

}
