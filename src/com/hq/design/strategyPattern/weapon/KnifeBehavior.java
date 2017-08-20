package com.hq.design.strategyPattern.weapon;

/**
 * Created by hq on 17/8/15.
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWarpon() {
        System.out.println("使用匕首进行刺杀");
    }
}
