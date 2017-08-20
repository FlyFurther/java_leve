package com.hq.design.strategyPattern.weapon;

/**
 * Created by hq on 17/8/15.
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWarpon() {
        System.out.println("使用弓箭进行射击");
    }
}
