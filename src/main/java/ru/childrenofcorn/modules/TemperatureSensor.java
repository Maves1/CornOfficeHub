package ru.childrenofcorn.modules;

public class TemperatureSensor implements Sensor {

    private String name;
    private float value;
    private String mu;

    public TemperatureSensor() {
        name = "Temperature Sensor";
        value = 28.8f;
        mu = "°C";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getValue() {
        return value;
    }

    @Override
    public String getMU() {
        return mu;
    }
}
