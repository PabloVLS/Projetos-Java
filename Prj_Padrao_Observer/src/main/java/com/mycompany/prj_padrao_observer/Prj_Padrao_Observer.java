package com.mycompany.prj_padrao_observer;

/**
 *
 * @author Pablo
 */
public class Prj_Padrao_Observer {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        
        weatherData.setMeasurements(80,65,30.4f);
        System.out.println("");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("");
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println("");
        
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(62, 90, 28.1f);
    }
}
