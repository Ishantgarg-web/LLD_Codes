package com.example.mediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class AuctionManager implements Mediator{

	List<Collegue> allBidders;
	
	public AuctionManager() {
		allBidders = new ArrayList<>();
	}
	
	

	@Override
	public void addBidder(Bidder bidder) {
		this.allBidders.add(bidder);
	}



	@Override
	public void addBid(Bidder bidder, int amount) {
		for (Collegue collegue: allBidders) {
			if(!(collegue.getName().equals(bidder.getName()))) {
				collegue.receiveNotifications(bidder, amount);
			}
		}
	}
	
}
