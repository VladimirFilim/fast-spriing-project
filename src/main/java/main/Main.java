package main;

import model.Comment;
import proxy.CommentNotificationProxy;
import proxy.EmailCommentNotificationProxy;
import repository.CommentRepository;
import repository.DBCommentRepository;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        CommentRepository commentRepository = new DBCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment();
        comment.setAuthor("Volodya");
        comment.setContent("Govnovoz");

        commentService.publishComment(comment);
    }
}
