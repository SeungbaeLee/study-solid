package com.study.solid.ocp.unapplied;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * OCP : 확장에 대해 열려있고 수정에 대해서는 닫혀있어야 한다는 원칙
 */
@Component
public class SHA256PasswordEncoder {
    /**
     * srp.applied.UserService에서 비밀번호 암호화를 강화하기 위해 새로운 PasswordEncoder를 생성
     * => 그렇다면 private final SimplePasswordEncoder passwordEncoder; 이 부분을
     * private final SHA256PasswordEncoder passwordEncoder; 이렇게 바꿔줘야함
     * ==> 새로운 암호화 정책과 무관한 UserService를 수정해야됨 => 수정에 닫혀있어야하지만 수정 할 수 밖에 없음
     */
    private final static String SHA_256 = "SHA-256";

    public String encryptPassword(final String pw)  {
        final MessageDigest digest;
        try {
            digest = MessageDigest.getInstance(SHA_256);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalArgumentException();
        }

        final byte[] encodedHash = digest.digest(pw.getBytes(StandardCharsets.UTF_8));

        return bytesToHex(encodedHash);
    }

    private String bytesToHex(final byte[] encodedHash) {
        final StringBuilder hexString = new StringBuilder(2 * encodedHash.length);

        for (final byte hash : encodedHash) {
            final String hex = Integer.toHexString(0xff & hash);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }

        return hexString.toString();
    }
}