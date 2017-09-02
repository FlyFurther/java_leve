package com.hq.design.decorationPattern;

import com.hq.design.decorationPattern.component.Beverage;
import com.hq.design.decorationPattern.component.HouseBlend;
import com.hq.design.decorationPattern.decorator.Mocha;

/**
 * Created by hq on 17/8/27.
 */
public class Test {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription());
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);
        System.out.println("------" + houseBlend.getDescription());
    }
}
