package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proxy.CommentNotificationProxy;
import repository.CommentRepository;

// Опубликовывает комментарий
@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy  commentNotificationProxy;

    public CommentService (
            CommentRepository commentRepository,
            @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy) {
        this.commentNotificationProxy = commentNotificationProxy;
        this.commentRepository = commentRepository;
    }
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
