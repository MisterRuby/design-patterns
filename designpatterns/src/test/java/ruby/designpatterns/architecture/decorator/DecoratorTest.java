package ruby.designpatterns.architecture.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    @DisplayName("데코레이터 패턴 테스트")
    void decoratorTest() {
        CommentService commentService = new DefaultCommentService();

        boolean isTrim = true;       // 외부에서 결정
        boolean isSpam = true;       // 외부에서 결정

        // 런타임 시에 외부에서 결정된 값에 따라 데코레이터들을 적용
        if (isTrim) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        if (isSpam) {
            // 데코레이터가 데코레이터를 감싸서 사용할 수도 있다.
            // -> 기능을 런타임 시에 상황에 따라 조합해서 적용할 수 있다.
            commentService = new SpamFilterCommentDecorator(commentService);
        }

        commentService.addComment("  앞 뒤 공백 제거!!  ");
        commentService.addComment("http://localhost:8080");
    }
}
