package com.example.adaptorDesignPattern;

public class BirdSparrow implements Bird{

	@Override
	public void fly() {
		System.out.println("Bird is fly");
	}

	@Override
	public void makeSound() {
		System.out.println("Bird is making sound chirp-chirp");
	}

}
