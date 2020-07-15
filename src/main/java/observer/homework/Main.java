package observer.homework;

import observer.homework.notification.InternetNews;
import observer.homework.notification.RadioNews;
import observer.homework.notification.TvNews;
import observer.homework.weather.WeatherForecast;

class Main {
    public static void main(String[] args) {
        WeatherForecast weatherForecast = new WeatherForecast(21, 997);

        InternetNews internetNews = new InternetNews();
        RadioNews radioNews = new RadioNews();
        TvNews tvNews = new TvNews();

        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(tvNews);

        weatherForecast.notifyObservers();
        System.out.println("-----------------------------------");

        weatherForecast.changeWeather(19, 1011);
        System.out.println("-----------------------------------");

        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.changeWeather(30, 1094);
    }
}
