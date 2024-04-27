package com.example.models;

public class Move {
	private Cordinate start;
	private Cordinate end;
	
	public Cordinate getStart() {
		return start;
	}
	public Cordinate getEnd() {
		return end;
	}
	
	public Move(Cordinate start, Cordinate end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	
}	
