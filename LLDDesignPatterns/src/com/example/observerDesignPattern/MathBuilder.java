package com.example.observerDesignPattern;

import java.util.ArrayList;

/**
 *
 * @author ishant
 * This is an App.
 */

public class MathBuilder extends PlayStore{
	
	public MathBuilder() {
		observerCollection = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		this.observerCollection.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		this.observerCollection.remove(observer);
	}

	@Override
	public void changedData(String message) {
		for (Observer ob1: this.observerCollection) {
			ob1.notifyObservers(message);
		}
	}


	
	

}
