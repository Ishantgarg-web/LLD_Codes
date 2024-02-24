package com.example.observerDesignPattern.obersever;

import com.example.observerDesignPattern.WeatherData;

public class CurrentDisplay implements IObserver, IDisplay{

	@Override
	public void display(WeatherData weatherData) {
		System.out.println("Weather Data in CurrentDisplay is: "+weatherData);
	}

	@Override
	public void update(WeatherData newWeather) {
		display(newWeather);
	}

	
}
