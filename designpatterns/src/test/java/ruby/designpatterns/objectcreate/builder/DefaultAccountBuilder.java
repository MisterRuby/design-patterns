package ruby.designpatterns.objectcreate.builder;

public class DefaultAccountBuilder implements AccountBuilder{

    private String email;
    private String name;
    private String password;

    @Override
    public AccountBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public AccountBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public AccountBuilder password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public Account getAccount() {
        return new Account(email, name, password);
    }
}
