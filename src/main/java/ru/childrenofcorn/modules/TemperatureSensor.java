package ru.childrenofcorn.modules;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor() {
        name = "Temperature Sensor";
        mu = "°C";
        valueName = "Temperature";
        value = 28.8f;
    }
}
