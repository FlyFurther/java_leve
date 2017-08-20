package com.hq.design.observerPattern.builtinObserver;

import java.util.Observable;

/**
 * Created by hq on 17/8/20.
 */
public class WeatherData extends Observable {
    private float tempreture;
    private float pressure;
    private float humidity;

    public WeatherData(){

    }

    public void measurementsChange() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float tempreture, float pressure, float humidity) {
        this.tempreture = tempreture;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementsChange();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTempreture() {
        return tempreture;
    }

    public float getPressure() {
        return pressure;
    }
}
