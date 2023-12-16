package com.study.solid.isp.applied;

import com.study.solid.isp.unapplied.PasswordEncoder;

/**
 *  비밀번호를 검사를 의미하는 별도의 인터페이스(PasswordChecker)를 만들고, 해당 인터페이스로 주입
 */
public class SHA256PasswordEncoder implements PasswordEncoder,PasswordChecker {
    @Override
    public String encryptPassword(String pw) {

        return pw;
    }

    @Override
    public String isCorrectPassword(final String rawPw, final String pw) {
        final String encryptedPw = encryptPassword(rawPw);
        return null;
    }
}
    /**
     *  OCP에 따르면 isCorrectPassword가 필요한 클래스는 PasswordChecker를 주입 받을텐데
     *  Checker를 주입 받았으면 encryptPassword에 접근 X
     *  Encoder를 주입 받았으면 isCorrectPassword에 접근 X ==> 불필요한 간섭을 최소화
     *  궁금한 점 : 어차피 해당 메소드만 끌어다 쓸건데 이게 불필요한 간섭인가?
     *  대형 프로젝트는 도메인, 기능 등 모든게 엄청 많고 클텐데 얼마만큼 세세하게 나누는가?
     *  둘 다 어쨋든 비밀번호 관련 로직인데, 이걸 나눌정도인가 이 나누는 명확한 기준점?
     */
