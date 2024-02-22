package com.example.strategyDesignPattern;

public class Main {
	public static void main(String[] args) {
		Duck1 duck1 = new Duck1(new QuackStrategy2(), "red");
		duck1.quack();
	}
}
