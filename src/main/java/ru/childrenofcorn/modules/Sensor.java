package ru.childrenofcorn.modules;

public abstract class Sensor {

    protected String name;
    protected String mu;
    protected String valueName;
    protected float value;

    public String getName() {
        return name;
    }

    public String getMU() {
        return mu;
    }

    public String getValueName() {
        return valueName;
    }

    public float getValue() {
        return value;
    }
}
