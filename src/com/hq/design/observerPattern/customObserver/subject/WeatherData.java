package com.hq.design.observerPattern.customObserver.subject;

import com.hq.design.observerPattern.customObserver.observer.Observer;

import java.util.LinkedList;

/**
 * Created by hq on 17/8/20.
 */
public class WeatherData implements Subject {
    private LinkedList<Observer> observers;
    private float tempreture;
    private float pressure;
    private float humidity;
    public WeatherData() {
        observers = new LinkedList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(tempreture, pressure, humidity);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float tempreture, float pressure, float humidity) {
        this.tempreture = tempreture;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChanged();
    }
}
