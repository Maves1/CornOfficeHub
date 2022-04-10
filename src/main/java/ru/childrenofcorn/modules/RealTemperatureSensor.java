package ru.childrenofcorn.modules;

import java.time.*;

public class RealTemperatureSensor implements TemperatureSensor {

    private float currentTemperature;

    public RealTemperatureSensor() {
        currentTemperature = 28.8f;
    }

    @Override
    public float getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(float currentTemperature) {
        this.currentTemperature = currentTemperature;
    }
}
