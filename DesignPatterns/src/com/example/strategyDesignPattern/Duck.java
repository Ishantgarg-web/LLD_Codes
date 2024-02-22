package com.example.strategyDesignPattern;

public abstract class Duck {
	private QuackStrategy quackStrategy;
	
	private String color;
	
	public Duck(QuackStrategy quackStrategy, String color) {
		this.quackStrategy = quackStrategy;
		this.color = color;
	}
	
	public void quack() {
		this.quackStrategy.quack();
	}
	
	
}
