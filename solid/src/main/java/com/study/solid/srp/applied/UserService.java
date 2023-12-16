package com.study.solid.srp.applied;

import com.study.solid.forcode.User;
import com.study.solid.forcode.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final SimplePasswordEncoder passwordEncoder;//비밀번호 암호화 로직을 따로 뺀 후 의존성 주입

    public void addUser(final String email, final String pw) {
        final String encryptedPassword = passwordEncoder.encryptPassword(pw);
        //메소드만 땡겨오면 된다. => 암호화 로직 수정 요구가 있어도 해당 클래스만 수정하면 되니 addUser에 영향이 없음

        final User user = User.builder()
                .email(email)
                .password(encryptedPassword).build();

        userRepository.save(user);
    }
}
