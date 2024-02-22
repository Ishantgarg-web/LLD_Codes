package com.example.strategyDesignPattern;

public class QuackStrategy1 implements QuackStrategy{

	@Override
	public void quack() {
		System.out.println("Quack Strategy 1");
	}

}
