package com.example.strategyDesignPattern.PaymentStrategy;

public class PaymentByUPI implements PaymentStrategy{
	
	@Override
	public void processOrder() {
		System.out.println("processing payment using UPI");
	}
	
}
