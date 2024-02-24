package com.example.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

import com.example.observerDesignPattern.obersever.IDisplay;
import com.example.observerDesignPattern.obersever.IObserver;

public abstract class State {
	private List<IObserver> observers;
	
	public State() {
		observers = new ArrayList<>();
	}
	
	public void notifyObservers(WeatherData newWeather) {
		for (IObserver observer: observers) {
			observer.update(newWeather);
		}
	}
	
	public void subscribe(IObserver observer) {
		observers.add(observer);
	}
	
	public void unsubscribe(IObserver observer) {
		observers.remove(observer);
	}
}
