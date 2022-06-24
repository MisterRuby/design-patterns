package ruby.designpatterns.architecture.decorator;


/**
 *
 */
public class TrimmingCommentDecorator extends CommentDecorator {

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(comment.trim());
    }
}
