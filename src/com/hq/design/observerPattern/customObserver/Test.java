package com.hq.design.observerPattern.customObserver;

import com.hq.design.observerPattern.customObserver.observer.CurrentConditionsDisplay;
import com.hq.design.observerPattern.customObserver.observer.Observer;
import com.hq.design.observerPattern.customObserver.subject.Subject;
import com.hq.design.observerPattern.customObserver.subject.WeatherData;

/**
 * Created by hq on 17/8/20.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData subject = new WeatherData();
        Observer observer = new CurrentConditionsDisplay(subject);
        subject.setMeasurements(1.1f, 0.25f, 0.37f);
        subject.setMeasurements(0.25f, 0.35f, 0.45f);
    }
}
