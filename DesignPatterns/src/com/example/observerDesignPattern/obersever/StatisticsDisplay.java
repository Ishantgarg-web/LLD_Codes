package com.example.observerDesignPattern.obersever;

import com.example.observerDesignPattern.WeatherData;

public class StatisticsDisplay implements IObserver, IDisplay{

	@Override
	public void display(WeatherData weatherData) {
		// TODO Auto-generated method stub
		System.out.println("Weather Data in StatisticsDisplay is: "+weatherData);
	}

	@Override
	public void update(WeatherData newWeather) {
		// TODO Auto-generated method stub
		display(newWeather);
	}

}
