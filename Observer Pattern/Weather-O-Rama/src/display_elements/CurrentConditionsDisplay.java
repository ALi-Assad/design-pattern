package display_elements;

import base.DisplayElement;
import base.Observer;
import subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;


    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
       this.temperature = weatherData.getTemperature();
       this.humidity = weatherData.getHumidity();
       display();

    }

    @Override
    public void display() {
         System.out.println("Current Conditions are "+ temperature +" F degree and " + humidity +" % humidity");
    }
}
