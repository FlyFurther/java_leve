package com.hq.design.strategyPattern;

import com.hq.design.strategyPattern.character.Character;
import com.hq.design.strategyPattern.character.Troll;
import com.hq.design.strategyPattern.weapon.KnifeBehavior;
import com.hq.design.strategyPattern.weapon.WeaponBehavior;

/**
 * Created by hq on 17/8/15.
 */
public class Test {
    public static void main(String[] args) {
        Character character = new Troll();
        WeaponBehavior weapon = new KnifeBehavior();
        character.setWeapon(weapon);
        character.fight();
    }
}
