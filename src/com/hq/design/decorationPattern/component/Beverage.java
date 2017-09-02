package com.hq.design.decorationPattern.component;

/**
 * Created by hq on 17/8/27.
 */
public abstract class Beverage {
    String description;
    public abstract float cost();
    public String getDescription() {
        return this.description;
    }
}
