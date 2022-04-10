package ru.childrenofcorn.modules;

public class HumiditySensor extends Sensor {

    public HumiditySensor() {
        name = "Humidity Sensor";
        mu = "%";
        valueName = "Humidity";
        value = 55;
    }

    @Override
    public float getValue() {
        float scalingValue = 5;
        int lowerBoundary = 45;

        float sin = (float) Math.sin(System.currentTimeMillis() / 10000 % Math.PI);
        this.value = (sin + 1) * scalingValue + lowerBoundary;

        return this.value;
    }
}
