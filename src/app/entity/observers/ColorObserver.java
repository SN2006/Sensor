package app.entity.observers;

import app.entity.TemperatureSensor;
import app.util.Color;

public class ColorObserver extends Observer{

    public ColorObserver(TemperatureSensor sensor){
        this.sensor = sensor;
        sensor.attach(this);
    }

    @Override
    public String getUpdate() {
        return String.format("Color: %s", this.getColor());
    }

    public Color getColor(){
        if (sensor.getTemperature() > 0) return Color.BLACK;
        return Color.WHITE;
    }
}
