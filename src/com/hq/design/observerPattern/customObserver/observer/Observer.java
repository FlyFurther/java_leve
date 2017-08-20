package com.hq.design.observerPattern.customObserver.observer;

/**
 * Created by hq on 17/8/20.
 */
public interface Observer {
    void update(float  tempreture, float pressure, float humidity);
}
