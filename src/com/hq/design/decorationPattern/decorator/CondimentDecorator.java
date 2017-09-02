package com.hq.design.decorationPattern.decorator;

import com.hq.design.decorationPattern.component.Beverage;

/**
 * Created by hq on 17/8/27.
 */
public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription();
}
