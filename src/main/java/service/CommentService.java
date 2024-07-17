package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import processor.CommentProcessor;
import repository.CommentRepository;

// Опубликовывает комментарий
@Component
@Lazy
@Scope("prototype")
public class CommentService {
    @Autowired
    private final CommentRepository commentRepository;

    @Autowired
    private ApplicationContext context;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
        System.out.println("CommentService instance created");
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public void sendComment (Comment comment) {
        CommentProcessor processor =
                context.getBean(CommentProcessor.class);

        processor.setComment(comment);
        processor.processComment(comment);
        processor.validateComment(comment);

        comment = processor.getComment();
    }
}
