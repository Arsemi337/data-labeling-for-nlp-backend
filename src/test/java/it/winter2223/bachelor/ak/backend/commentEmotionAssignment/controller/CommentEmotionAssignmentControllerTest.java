package it.winter2223.bachelor.ak.backend.commentEmotionAssignment.controller;

import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.dto.CommentEmotionAssignmentInput;
import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.dto.CommentEmotionAssignmentOutput;
import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.dto.EmotionDto;
import it.winter2223.bachelor.ak.backend.commentEmotionAssignment.service.CommentEmotionAssignmentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@SpringBootTest
@AutoConfigureMockMvc
class CommentEmotionAssignmentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    CommentEmotionAssignmentService commentEmotionAssignmentService;

    @Test
    @DisplayName("when correct data is passed, CommentEmotionAssignmentOutput should be returned")
    void shouldPostCommentEmotionAssignment() throws Exception {
        UUID assignmentId = UUID.randomUUID();
        UUID commentId = UUID.randomUUID();

        when(commentEmotionAssignmentService.postCommentEmotionAssignment(any(CommentEmotionAssignmentInput.class)))
                .thenReturn(getAssignmentOutput(assignmentId, commentId));
        CommentEmotionAssignmentOutput assignmentOutput = getAssignmentOutput(assignmentId, commentId);

        mockMvc.perform(getAssignmentPostRequest(commentId))
                .andExpect(jsonPath("$.assignmentId", equalTo(assignmentOutput.assignmentId().toString())))
                .andExpect(jsonPath("$.commentId", equalTo(assignmentOutput.commentId().toString())))
                .andExpect(jsonPath("$.emotionDto", equalTo(EmotionDto.JOY.toString())));
        verify(commentEmotionAssignmentService).postCommentEmotionAssignment(any(CommentEmotionAssignmentInput.class));
    }

    private static MockHttpServletRequestBuilder getAssignmentPostRequest(UUID commentId) {
        return MockMvcRequestBuilders.post("/api/v1/assignment")
                .contentType("application/json")
                .content(String.format("""
                        {
                            "commentId": "%s",
                            "emotion": "JOY"
                        }
                        """, commentId));
    }

    private CommentEmotionAssignmentOutput getAssignmentOutput(UUID assignmentId, UUID commentId) {
        return CommentEmotionAssignmentOutput.builder()
                .assignmentId(assignmentId)
                .commentId(commentId)
                .emotionDto(EmotionDto.JOY)
                .build();
    }
}
