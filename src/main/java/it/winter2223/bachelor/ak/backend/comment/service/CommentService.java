package it.winter2223.bachelor.ak.backend.comment.service;

import it.winter2223.bachelor.ak.backend.comment.dto.CommentOutput;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CommentService {

    List<CommentOutput> getYTComments();

//    String putComments(List<CommentInput> commentInputList, boolean isAssigned);

    Page<CommentOutput> fetchCommentsList(Pageable number);
}
