package com.study.solid.srp.unapplied;

import com.study.solid.forcode.User;
import com.study.solid.forcode.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * SRP : 해당 모듈이 여러 대상 또는 액터들에 대해 책임을 가져서는 안되고, 오직 하나의 액터에 대해서만 책임을 져야 한다
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void addUser(final String email, final String pw) {//유저 생성 기능에
        final StringBuilder sb = new StringBuilder();

        for(byte b : pw.getBytes(StandardCharsets.UTF_8)) {//비밀번호 암호화 로직도 있음 => 하나의 모듈이 여러 책임을 가짐
            sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
        }
        //만약 비밀번호 암호화 방식을 바꾼다면 암호화 로직 외에도 addUser에도 영향이 간다 -> 유지보수에 매우 불편
        final String encryptedPassword = sb.toString();
        final User user = User.builder()
                .email(email)
                .password(encryptedPassword).build();

        userRepository.save(user);
    }
}
/**
 * 비밀 번호 암호화는 계정 생성 외에는 쓸 일이 없어보인다.
 * 그럼 UserService Class에 메소드만 따로 만들어 가져다 써도 이건 SRP에 위배되나?
 * 개인적인 느낌 -> 핵심은 로직 안에 로직이 있는 것이 문제인거 같은데 그럼,
 * 해당 클래스 안에 메소드를 만들어서 땡겨쓰나, 클래스를 따로 파서 의존성 주입 후 땡겨쓰는거나
 * 굳이 클래스를 따로 만들어야 하나?
 */