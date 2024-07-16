package service;

import model.Comment;
import org.springframework.stereotype.Component;
import proxy.CommentNotificationProxy;
import repository.CommentRepository;

// Опубликовывает комментарий
@Component
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy  commentNotificationProxy;

    public CommentService (
            CommentRepository commentRepository,
            CommentNotificationProxy commentNotificationProxy) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
