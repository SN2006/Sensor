package app.entity.observers;

import app.entity.TemperatureSensor;

public abstract class Observer {

    protected TemperatureSensor sensor;

    public abstract String getUpdate();

}
