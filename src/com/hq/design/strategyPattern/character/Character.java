package com.hq.design.strategyPattern.character;

import com.hq.design.strategyPattern.weapon.WeaponBehavior;

/**
 * Created by hq on 17/8/15.
 */
public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
