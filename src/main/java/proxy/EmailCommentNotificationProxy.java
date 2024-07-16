package proxy;

import model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    public void sendComment(Comment comment) {
        System.out.println("sending notification for comment: " + comment.getContent());
    }
}
