package com.study.solid.isp.unapplied;

/**
 * ISP : 클라이언트의 목적과 용도에 적합한 인터페이스 만을 제공
 */
/**
 * 사용자가 비밀번호를 변경할 때 입력한 비밀번호가 기존의 비밀번호와 동일한지 검사해야 하는 로직을
 * 다른 Authentication 로직에 추가해야 한다는 요청사항
 * isCorrectPassword라는 퍼블릭 인터페이스를 SHA256PasswordEncoder에 추가
 **/
public class SHA256PasswordEncoder implements PasswordEncoder {
    @Override
    public String encryptPassword(String pw) {

        return pw;
    }

    public String isCorrectPassword(final String rawPw, final String pw) {
        final String encryptedPw = encryptPassword(rawPw);
        return null;
    }
}
