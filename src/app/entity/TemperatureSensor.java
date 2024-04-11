package app.entity;

import app.entity.observers.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TemperatureSensor {

    private final List<Observer> observers =new ArrayList<>();
    private int temperature;

    public String setTemperature(int temperature){
        this.temperature = temperature;
        return notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public String notifyAllObservers() {
        StringBuilder builder = new StringBuilder("--------------------------------\n");
        builder.append("Temperature: ")
                .append(this.temperature)
                .append(" C\n");
        AtomicInteger counter = new AtomicInteger();
        observers.forEach(observer -> builder
                .append(counter.incrementAndGet())
                .append(") ")
                .append(observer.getUpdate())
                .append("\n"));
        builder.append("--------------------------------");
        return builder.toString();
    }

    public int getTemperature() {
        return temperature;
    }
}
