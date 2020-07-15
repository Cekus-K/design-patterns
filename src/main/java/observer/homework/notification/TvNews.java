package observer.homework.notification;

import observer.homework.weather.WeatherForecast;

public class TvNews implements Observer {
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("TV news: The current temperature is: "
                + weatherForecast.getTemperature() + " degrees and the current pressure is: "
                + weatherForecast.getPressure() + " hectopascals.");
    }
}
