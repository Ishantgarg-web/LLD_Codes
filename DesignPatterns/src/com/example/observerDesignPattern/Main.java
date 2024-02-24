package com.example.observerDesignPattern;

import com.example.observerDesignPattern.obersever.CurrentDisplay;
import com.example.observerDesignPattern.obersever.ForecastDisplay;
import com.example.observerDesignPattern.obersever.StatisticsDisplay;


public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData(10, 100);
		
		CurrentDisplay currentDisplay = new CurrentDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		
		weatherData.subscribe(currentDisplay);
		weatherData.subscribe(forecastDisplay);
		
		weatherData.update(1, 1);
		statisticsDisplay.display(weatherData);
		
		weatherData.unsubscribe(currentDisplay);
		
		currentDisplay.display(weatherData);
	}
}
