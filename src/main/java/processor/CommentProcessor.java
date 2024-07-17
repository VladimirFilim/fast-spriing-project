package processor;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import repository.CommentRepository;
import repository.DBCommentRepository;

@Component
@Scope("prototype")
public class CommentProcessor {
    @Autowired
    private CommentRepository commentRepository;
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public void processComment(Comment comment) {

    }

    public void validateComment(Comment comment) {

    }
}
