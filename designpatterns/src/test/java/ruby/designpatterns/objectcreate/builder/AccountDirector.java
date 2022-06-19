package ruby.designpatterns.objectcreate.builder;

/**
 * 특정 값으로 정해진 인스턴스를 만들어 반환해주는 Director
 */
public class AccountDirector {

    private AccountBuilder accountBuilder;

    public AccountDirector(AccountBuilder accountBuilder) {
        this.accountBuilder = accountBuilder;
    }

    public Account admin() {
        return accountBuilder
                .email("admin@gmail.com")
                .name("admin")
                .password("1234")
                .getAccount();
    }

    public Account manager() {
        return accountBuilder
                .email("manager@gmail.com")
                .name("manager")
                .password("1234")
                .getAccount();
    }
}
