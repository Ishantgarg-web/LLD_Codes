package com.example.observerDesignPattern;

public class Observer {
	
	String observerName;
	
	public Observer(String observerName) {
		this.observerName = observerName;
	}

	public void notifyObservers(String message) {
		System.out.println(this.observerName+" notified with message: "+message);
	}
	
}
