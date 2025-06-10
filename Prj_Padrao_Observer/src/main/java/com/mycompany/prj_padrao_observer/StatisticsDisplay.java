package com.mycompany.prj_padrao_observer;

/**
 *
 * @author Pablo
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    private float maxtemp = 0.0f;
    private float minTemp = 200f;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;
    
    
    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    


    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum+=temp;
        numReadings++;
        if(temp > maxtemp){
            maxtemp = temp;
        }
        if(temp < minTemp){
            minTemp= temp;
        }
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "+(tempSum / numReadings)+ "/" + maxtemp + "/" + minTemp);
    }
}
