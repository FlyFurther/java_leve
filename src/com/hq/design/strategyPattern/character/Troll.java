package com.hq.design.strategyPattern.character;

/**
 * Created by hq on 17/8/15.
 */
public class Troll extends Character {
    @Override
    public void fight() {
        weapon.useWarpon();
    }
}
