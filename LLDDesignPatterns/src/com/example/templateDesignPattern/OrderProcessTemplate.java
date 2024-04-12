package com.example.templateDesignPattern;

public abstract class OrderProcessTemplate {
	
	public abstract void doSelect();
	
	public abstract void doPayment();
	
	public abstract void doDelivery();
	
	public void gift() {
		System.out.println("Wrap with the product");
	}
	
	public void processOrder(boolean gift) {
		doSelect();
		doPayment();
		if(gift) {
			gift();
		}
		doDelivery();
	}
	
}
