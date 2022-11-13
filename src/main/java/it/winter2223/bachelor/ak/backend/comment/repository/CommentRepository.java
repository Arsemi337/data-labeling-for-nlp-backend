package it.winter2223.bachelor.ak.backend.comment.repository;

import it.winter2223.bachelor.ak.backend.comment.persistence.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends MongoRepository<Comment, String> {

    Page<Comment> findByIsAssigned(boolean isAssigned, Pageable pageable);
}
