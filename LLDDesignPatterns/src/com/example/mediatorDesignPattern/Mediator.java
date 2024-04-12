package com.example.mediatorDesignPattern;

public interface Mediator {
	
	void addBid(Bidder bidder, int amount);
	
	void addBidder(Bidder bidder);
	
}
