package com.example.observerDesignPattern;

import java.util.ArrayList;

public class GoogleDrive extends PlayStore{
	
	public GoogleDrive() {
		observerCollection = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observerCollection.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observerCollection.remove(observer);
	}

	@Override
	public void changedData(String message) {
		for (Observer ob1: this.observerCollection) {
			// it will notify the observers of this app.
			ob1.notifyObservers(message);
		}
	}



}
