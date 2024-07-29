package service;

import Aspect.ToLog;
import model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

// Опубликовывает комментарий
@Service
public class CommentService {
    private final Logger logger = Logger.getLogger(CommentService.class.getName());
    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getContent());
        return "SUCCESS";
    }
}
