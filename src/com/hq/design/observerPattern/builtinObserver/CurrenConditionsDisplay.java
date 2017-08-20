package com.hq.design.observerPattern.builtinObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hq on 17/8/20.
 */
public class CurrenConditionsDisplay implements Observer {
    private float tempreture;
    private float pressure;
    private Observable observable;

    public CurrenConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }
    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param o   the observable object.
     * @param arg an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.tempreture = weatherData.getTempreture();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("tempreture:" + tempreture + ", pressure:" + pressure);
    }
}
