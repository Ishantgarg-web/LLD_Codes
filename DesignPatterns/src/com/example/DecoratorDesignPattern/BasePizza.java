package com.example.DecoratorDesignPattern;

public class BasePizza implements Pizza{

	@Override
	public String getDescription() {
		return "Base Pizza";
	}

	@Override
	public float getCost() {
		return 100.0f;
	}

}
