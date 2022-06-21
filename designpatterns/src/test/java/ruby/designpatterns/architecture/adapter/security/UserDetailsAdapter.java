package ruby.designpatterns.architecture.adapter.security;

import ruby.designpatterns.architecture.adapter.Account;

/**
 * Account 를 UserDetails 으로 변환해주는 adapter
 */
public class UserDetailsAdapter implements UserDetails {

    private Account account;

    public UserDetailsAdapter(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
