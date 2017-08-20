package com.hq.design.observerPattern.customObserver.observer;

import com.hq.design.observerPattern.customObserver.subject.Subject;

/**
 * Created by hq on 17/8/20.
 */
public class CurrentConditionsDisplay implements  Observer {
    private float tempreture;
    private float pressure;
    private Subject subject;

    public CurrentConditionsDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float tempreture, float pressure, float humidity) {
        this.tempreture = tempreture;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("tempreture:" + tempreture + ", pressure:" + pressure);
    }
}
