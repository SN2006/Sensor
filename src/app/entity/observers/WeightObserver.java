package app.entity.observers;

import app.entity.TemperatureSensor;

public class WeightObserver extends Observer{

    public WeightObserver(TemperatureSensor sensor){
        this.sensor = sensor;
        sensor.attach(this);
    }

    @Override
    public String getUpdate() {
        return String.format("Weight: %d grams", getWeightInGrams());
    }

    public int getWeightInGrams(){
        if (sensor.getTemperature() <= 0) return 1;
        return 1 + 2 * sensor.getTemperature();
    }
}
