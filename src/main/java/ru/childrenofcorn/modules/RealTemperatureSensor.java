package ru.childrenofcorn.modules;

import java.time.*;

public class RealTemperatureSensor implements TemperatureSensor {

    @Override
    public float getCurrentTemperature() {
        return 23.4f;
    }
}
