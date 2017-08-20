package com.hq.design.observerPattern.builtinObserver;

/**
 * Created by hq on 17/8/20.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrenConditionsDisplay currenConditionsDisplay = new CurrenConditionsDisplay(weatherData);
        weatherData.setMeasurements(1.1f, 1.2f, 1.3f);
        weatherData.setMeasurements(0.1f, 0.2f, 0.3f);
    }
}
