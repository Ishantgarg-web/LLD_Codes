package com.example.Light;

public class GreenLight extends Light{
	
	Direction dir;
	public GreenLight(String id,Direction direction) {
		super(State.GREEN, id,direction);
		this.dir = direction;
	}

	@Override
	public Light changeState() {
		return new YellowLight(this.getId(),this.dir);
	}


}
