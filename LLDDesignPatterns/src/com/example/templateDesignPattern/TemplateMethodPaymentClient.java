package com.example.templateDesignPattern;

/**
 * 
 * @author ishant
 * Here, we will define pattern like in this example - OnlineOrder and storeOrder.
 * in this, we define different functionality for both of these but processOrder() will doing these
 * steps in same way.
 */

public class TemplateMethodPaymentClient {
	
	public static void main(String[] args) {
		
		OnlineOrder onlineOrder = new OnlineOrder();
		
		StoreOrder storeOrder = new StoreOrder();
		
		onlineOrder.processOrder(true);
		storeOrder.processOrder(false);
		
	}
}
