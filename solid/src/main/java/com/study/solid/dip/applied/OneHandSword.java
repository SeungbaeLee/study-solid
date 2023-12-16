package com.study.solid.dip.applied;

class OneHandSword implements Weaponable {
    final String NAME;
    final int DAMAGE;

    OneHandSword(String name, int damage) {
        NAME = name;
        DAMAGE = damage;
    }

    public int attack() {
        return DAMAGE;
    }
}
