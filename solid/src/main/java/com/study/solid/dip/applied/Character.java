package com.study.solid.dip.applied;


public class Character {
    final String NAME;
    int health;
//  OneHandSword weapon; // 의존 저수준 객체
    Weaponable weaponable;//고수준의 모듈로 의존

    public Character(String NAME, int health, Weaponable weaponable) {
        this.NAME = NAME;
        this.health = health;
        this.weaponable = weaponable;
    }

    int attack() {
        return weaponable.attack();
    }

    void chageWeapon(Weaponable weapon) {
        this.weaponable = weapon;
    }

    void getInfo() {
        System.out.println("이름: " + NAME);
        System.out.println("체력: " + health);
        System.out.println("무기: " + weaponable);
    }
}
