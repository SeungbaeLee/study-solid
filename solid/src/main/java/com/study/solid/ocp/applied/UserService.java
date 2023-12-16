package com.study.solid.ocp.applied;

import com.study.solid.forcode.User;
import com.study.solid.forcode.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    //private final SimplePasswordEncoder passwordEncoder;
    //          ||
    //          \/  구현체가 아닌 상위 인터페이스 주입
    private final PasswordEncoder passwordEncoder;



    public void addUser(final String email, final String pw) {
        final String encryptedPassword = passwordEncoder.encryptPassword(pw);

        final User user = User.builder()
                .email(email)
                .password(encryptedPassword).build();

        userRepository.save(user);
    }
}

/**
 * 상위 인터페이스를 의존성 주입해서 구현하는 하위 클래스가 수정되던 바뀌던
 * 원하는 메소드를 호출 할 수 있게되므로
 * 새로운 수정사항과 무관한 클래스의 수정은 막고 확장은 열려있을 수 있게된다.
 *
 * 궁금한 점 : 수정요구로 인해 인터페이스를 구현한 클래스가 두개가 생길 시
 * 인터페이스 주입 시 주입되는 클래스(오버라이딩 되는 메소드 등) 어떤 게 되는건가?
 * 만약 수정사항이 있어서 클래스를 하나 만들어서 구현했다면 전에 쓰던 클래스는 삭제해야하는건가?
 */
