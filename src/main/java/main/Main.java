package main;

import application_config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var service = context.getBean(CommentService.class);

        Comment comment=  new Comment();
        comment.setContent("Demo comment");
        comment.setAuthor("Demo author");

        service.publishComment(comment);
    }
}
