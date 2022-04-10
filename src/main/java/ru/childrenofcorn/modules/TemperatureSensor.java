package ru.childrenofcorn.modules;

public class TemperatureSensor extends Sensor {

    public TemperatureSensor() {
        name = "Temperature Sensor";
        mu = "°C";
        valueName = "Temperature";
        value = 28.8f;
    }

    @Override
    public float getValue() {
        float scalingValue = 10;
        int lowerBoundary = 20;

        float sin = (float) Math.sin(System.currentTimeMillis() / 1000 % Math.PI);
        this.value = (sin + 1) * scalingValue + lowerBoundary;

        return this.value;
    }
}
