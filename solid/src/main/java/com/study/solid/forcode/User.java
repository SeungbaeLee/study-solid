package com.study.solid.forcode;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class User {

    @Id
    private long Id;

    private String Email;

    private String password;

    @Builder
    public User(String email, String password) {
        Email = email;
        this.password = password;
    }
}
