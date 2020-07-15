package observer.homework.weather;

import observer.homework.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        this.registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.registeredObservers.forEach(observer -> observer.updateForecast(this));
    }

    public void changeWeather(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
