package com.example.mediatorDesignPattern;

/**
 * 
 * @author ishant
 * this is a behavioural design pattern. In this Mediator is behaving like mediator between 
 * two collegues or two objects of same entity.
 * 
 * In this example, We take AuctionManager as a mediator that behave like mediator between
 * collegues.
 */

public class MediatorMain {
	public static void main(String[] args) {
		AuctionManager am = new AuctionManager();
		
		Bidder ishant = new Bidder(am, "ishant");
		Bidder sahil = new Bidder(am, "sahil");
		
		/**
		 * TODO: try to work on this, remove auctionManager dependency from one of the two places
		 * either from line 17 or line 25.
		 */
		
		am.addBidder(ishant);
		am.addBidder(sahil);
		
		ishant.placeBid(100);
		sahil.placeBid(500);
		ishant.placeBid(1000);
	}
}
