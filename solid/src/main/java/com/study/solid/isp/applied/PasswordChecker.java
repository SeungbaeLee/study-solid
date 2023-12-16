package com.study.solid.isp.applied;

public interface PasswordChecker {
    String isCorrectPassword(final String rawPw, final String pw);
}
