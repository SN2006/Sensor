package app.model;

import app.entity.TemperatureSensor;
import app.entity.observers.ColorObserver;
import app.entity.observers.WeightObserver;

public class AppModel {

    private final TemperatureSensor sensor = new TemperatureSensor();

    public AppModel(){
        new ColorObserver(sensor);
        new WeightObserver(sensor);
    }

    public String getUpdates(int temperature){
        return sensor.setTemperature(temperature);
    }

}
