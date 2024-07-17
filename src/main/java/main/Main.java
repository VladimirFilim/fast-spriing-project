package main;

import application_config.ProjectConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import service.UserService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var bean1 = context.getBean(CommentService.class);
        var bean2 = context.getBean(UserService.class);
        System.out.println(bean1.getCommentRepository() == bean2.getRepo());
    }
}
