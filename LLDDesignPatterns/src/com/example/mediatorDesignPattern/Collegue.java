package com.example.mediatorDesignPattern;

public interface Collegue{
	
	String getName();
	
	void placeBid(int amount);
	
	void receiveNotifications(Bidder bidder, int amount);
	
}
