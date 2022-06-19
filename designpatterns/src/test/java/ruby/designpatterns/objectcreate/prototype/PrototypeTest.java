package ruby.designpatterns.objectcreate.prototype;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PrototypeTest {

    @Test
    @DisplayName("")
    void prototypeTest() throws CloneNotSupportedException {
        Document document = new Document();
        document.setTitle("테스트");
        document.setContents("테스트용 본문입니다");

        // 같은 필드 값을 가진 다른 인스턴스를 생성
        // 내부 필드가 primitive 타입이 아닌 object 타입의 값들은 얕은 복사로 처리된다.
        // 깊은 복사로 처리하고 싶다면 clone 메서드의 구현을 별도로 작성해야 한다.
        Document clone = (Document)document.clone();

        assertThat(document == clone).isFalse();
        assertThat(document).isEqualTo(clone);
        assertThat(document.getClass()).isEqualTo(clone.getClass());
    }
}
