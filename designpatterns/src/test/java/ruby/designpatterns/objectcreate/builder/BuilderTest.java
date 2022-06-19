package ruby.designpatterns.objectcreate.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    @DisplayName("빌더를 통해 인스턴스 생성하기")
    void builderTest() {
        DefaultAccountBuilder builder = new DefaultAccountBuilder();
        Account rubyAccount = builder
                .email("rubykim0723@gmail.com")
                .name("ruby")
                .password("1234")
                .getAccount();

        Account testAccount = builder
                .email("asdfsd@naver.com")
                .password("asdbjksf")
                .getAccount();

        Account adminAccount = new AccountDirector(builder).admin();
    }
}
