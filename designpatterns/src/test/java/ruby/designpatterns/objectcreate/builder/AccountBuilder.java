package ruby.designpatterns.objectcreate.builder;

public interface AccountBuilder {

    AccountBuilder email (String email);
    AccountBuilder name (String name);
    AccountBuilder password (String password);

    Account getAccount();
}
