package com.example.mediatorDesignPattern;

public class Bidder implements Collegue{
	
	String name;
	Mediator mediator;
	
	public Bidder(Mediator mediator, String name) {
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return this.name;
	}


	@Override
	public void receiveNotifications(Bidder bidder, int amount) {
		System.out.println(bidder.getName()+" is applied for "+amount+" bid.");
	}

	@Override
	public void placeBid(int amount) {
		this.mediator.addBid(this, amount);
	}

}
