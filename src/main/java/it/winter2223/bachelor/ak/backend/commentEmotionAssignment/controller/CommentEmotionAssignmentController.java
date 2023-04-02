package it.winter2223.bachelor.ak.backend.commentEmotionAssignment.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.dto.CommentEmotionAssignmentInput;
import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.dto.CommentEmotionAssignmentOutput;
import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.service.CommentEmotionAssignmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@Tag(name = "Comment emotion assignment")
@RequestMapping("/api/v1/assignment")
@SecurityRequirement(name = "Bearer Authentication")
class CommentEmotionAssignmentController {

    private final CommentEmotionAssignmentService commentEmotionAssignmentService;

    CommentEmotionAssignmentController(CommentEmotionAssignmentService commentEmotionAssignmentService) {
        this.commentEmotionAssignmentService = commentEmotionAssignmentService;
    }

    @PostMapping
    @Operation(summary = "Post comment-emotion assignment")
    @PreAuthorize("hasAuthority('USER_READ_WRITE')")
    ResponseEntity<List<CommentEmotionAssignmentOutput>> postCommentEmotionAssignments(
            @RequestBody List<CommentEmotionAssignmentInput> commentEmotionAssignmentInput) {
        return ResponseEntity.ok(commentEmotionAssignmentService.postCommentEmotionAssignments(commentEmotionAssignmentInput));
    }

    @GetMapping("/dataset")
    @Operation(summary = "Get comment-emotion assignments as CSV file")
    @PreAuthorize("hasAuthority('USER_READ_WRITE')")
    void fetchCommentEmotionAssignments(HttpServletResponse servletResponse) {
        commentEmotionAssignmentService.generateCommentEmotionAssignmentsDataset(servletResponse);
    }
}
