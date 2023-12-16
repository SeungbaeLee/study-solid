package com.study.solid.lsp.unapplied.case1;

public class Animal {
    int speed = 100;

    int go(int distance) {
        return speed * distance;
    }
}