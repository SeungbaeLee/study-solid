package com.study.solid.dip.unapplied;

/**
 * DIP =  어떤 Class를 참조해서 사용해야하는 상황이 생긴다면, 그 Class를 직접 참조하는 것이 아니라 그 대상의 상위 요소(추상 클래스 or 인터페이스)로 참조
 * 하위 모듈을 직접 가져다 쓸 경우 => 하위 모듈의 구체적인 내용에 클라이언트가 의존하게 되어 하위 모듈에 변화가 있을 때마다 클라이언트나 상위 모듈의 코드를 자주 수정
 * 클래스에 클래스를 주입하는 경우는 바람직하지 못한가? => 클래스간의 상위 하위 구분은 어떻게??
 */
public class Character {
    final String NAME;
    int health;
    OneHandSword weapon; // 의존 저수준 객체

    Character(String name, int health, OneHandSword weapon) {
        this.NAME = name;
        this.health = health;
        this.weapon = weapon;
    }

    int attack() {
        return weapon.attack(); // 의존 객체에서 메서드를 실행
    }

    void chageWeapon(OneHandSword weapon) {
        this.weapon = weapon;
    }

    void getInfo() {
        System.out.println("이름: " + NAME);
        System.out.println("체력: " + health);
        System.out.println("무기: " + weapon);
    }
}
