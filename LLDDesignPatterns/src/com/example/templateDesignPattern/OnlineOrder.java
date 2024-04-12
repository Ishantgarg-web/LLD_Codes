package com.example.templateDesignPattern;

public class OnlineOrder extends OrderProcessTemplate{

	@Override
	public void doSelect() {
		System.out.println("Select the order from website");
	}

	@Override
	public void doPayment() {
		System.out.println("pay the order using UPI");
	}

	@Override
	public void doDelivery() {
		System.out.println("Delive the order through LP");
	}
	
}
