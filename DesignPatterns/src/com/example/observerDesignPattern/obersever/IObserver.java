package com.example.observerDesignPattern.obersever;

import com.example.observerDesignPattern.WeatherData;

public interface IObserver {
	void update(WeatherData newWeather);
}
