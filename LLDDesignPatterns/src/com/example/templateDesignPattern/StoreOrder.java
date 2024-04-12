package com.example.templateDesignPattern;

public class StoreOrder extends OrderProcessTemplate{

	@Override
	public void doSelect() {
		System.out.println("select the order from store");
	}

	@Override
	public void doPayment() {
		System.out.println("pay using cash");
	}

	@Override
	public void doDelivery() {
		System.out.println("we can skip this");
	}

}
