package it.winter2223.bachelor.ak.backend.comment.service.impl;

import it.winter2223.bachelor.ak.backend.comment.dto.CommentOutput;
import it.winter2223.bachelor.ak.backend.comment.persistence.Comment;

class CommentMapper {

    CommentOutput mapToCommentOutput(Comment comment) {
        return CommentOutput.builder()
                .commentId(comment.getCommentId())
                .content(comment.getContent())
                .build();
    }
}
