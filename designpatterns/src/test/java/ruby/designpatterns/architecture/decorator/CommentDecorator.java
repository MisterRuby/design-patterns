package ruby.designpatterns.architecture.decorator;

/**
 * CommentService 타입이자 외부로부터 CommentService 를 받는 Decorator
 */
public class CommentDecorator implements CommentService{

    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
