package ruby.designpatterns.objectcreate.builder;

public class Account {

    private String email;
    private String name;
    private String password;

    public Account(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
