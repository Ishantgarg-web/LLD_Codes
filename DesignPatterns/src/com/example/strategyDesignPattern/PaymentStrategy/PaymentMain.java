package com.example.strategyDesignPattern.PaymentStrategy;

public class PaymentMain {
	
	PaymentStrategy paymentStrategy;
	
	public PaymentMain(PaymentStrategy paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}
	
	public void processPayment() {
		this.paymentStrategy.processOrder();
	}
	
	public static void main(String[] args) {
		
		PaymentMain upiPayment = new PaymentMain(new PaymentByUPI());
		upiPayment.processPayment();
		
		PaymentMain cardPayment = new PaymentMain(new PaymentByCard());
		cardPayment.processPayment();
	}
}
