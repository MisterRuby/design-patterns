package ruby.designpatterns.architecture.adapter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ruby.designpatterns.architecture.adapter.security.UserDetails;
import ruby.designpatterns.architecture.adapter.security.UserDetailsAdapter;
import ruby.designpatterns.architecture.adapter.security.UserDetailsService;

public class AdapterTest {

    @Test
    @DisplayName("어탭터 패턴 테스트")
    void adapterTest() {

        Account account = new Account();
        account.setName("ruby");
        account.setPassword("1234");

        // UserDetailsService.login 메서드는 파라미터가 UserDetails 타입만을 받을 수 있다.
        // -> Account 를 어댑터를 통해 UserDetails 타입으로 변환
        UserDetails userDetails = new UserDetailsAdapter(account);

        UserDetailsService userDetailsService = new UserDetailsService();
        String loginUser = userDetailsService.login(userDetails);

        Assertions.assertThat("ruby").isEqualTo(loginUser);
    }
}
