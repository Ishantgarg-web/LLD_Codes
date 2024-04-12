package com.example.commandDesignPattern.commands.light;

public class Light {
	
	String place;
	String state;
	
	public Light(String place) {
		this.place = place;
		this.state = "off"; // initially light is off
	}
	
	public void off() {
		this.state = "off";
	}
	
	public void on() {
		this.state = "on";
	}
	
	public String getPlace() {
		return place;
	}
}
