package ruby.designpatterns.architecture.adapter.security;

public class UserDetailsService {

    public String login (UserDetails userDetails) {
        // 로그인 처리 로직 실행....
        return userDetails.getUsername();
    }
}
