package com.example.adaptorDesignPattern;

public class BirdAdaptor implements Duck{

	private Bird bird;
	
	public BirdAdaptor(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void squeek() {
		// We will convert this given bird to Duck
		this.bird.makeSound();
	}
	
}
