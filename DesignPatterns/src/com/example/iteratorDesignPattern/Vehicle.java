package com.example.iteratorDesignPattern;

public class Vehicle {
	private int number;
	
	public Vehicle(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "Vehicle [number=" + number + "]";
	}

}
