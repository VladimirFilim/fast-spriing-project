package main;

import application_config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        Comment comment = new Comment();
        comment.setAuthor("Volodya");
        comment.setContent("Govnovoz");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
