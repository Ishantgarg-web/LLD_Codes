package com.example.observerDesignPattern;

import java.util.List;

public abstract class  PlayStore {
	
	List<Observer> observerCollection;
	
	public abstract void registerObserver(Observer observer);
	
	public abstract void unregisterObserver(Observer observer);
	
	public abstract void changedData(String message);
}
