package com.study.solid.dip.unapplied;

public class OneHandSword {
    final String NAME;
    final int DAMAGE;

    public OneHandSword(String NAME, int DAMAGE) {
        this.NAME = NAME;
        this.DAMAGE = DAMAGE;
    }
    int attack() {
        return DAMAGE;
    }
}
