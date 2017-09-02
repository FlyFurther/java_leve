package com.hq.design.decorationPattern.decorator;

import com.hq.design.decorationPattern.component.Beverage;

/**
 * Created by hq on 17/8/27.
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public float cost() {
        return 0.9f + beverage.cost();
    }

    @Override
    public String getDescription() {
        System.out.println(1);
        return beverage.getDescription() + "+mocha";
    }
}
