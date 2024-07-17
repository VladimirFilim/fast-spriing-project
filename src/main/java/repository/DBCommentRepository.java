package repository;

import model.Comment;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class DBCommentRepository implements CommentRepository {
}
