package com.example.strategyDesignPattern.PaymentStrategy;

public class PaymentByCard implements PaymentStrategy{

	
	@Override
	public void processOrder() {
		System.out.println("processing payment by Card");
	}

}
