package com.hq.design.decorationPattern.component;

/**
 * Created by hq on 17/8/27.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "houseBlen";
    }
    @Override
    public float cost() {
        return 1.99f;
    }
}
