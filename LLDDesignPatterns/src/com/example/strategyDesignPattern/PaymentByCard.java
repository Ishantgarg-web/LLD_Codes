package com.example.strategyDesignPattern;

public class PaymentByCard implements PaymentStrategy{

	
	@Override
	public void processOrder() {
		System.out.println("processing payment by Card");
	}

}
