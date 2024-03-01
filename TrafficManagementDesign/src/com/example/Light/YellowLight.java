package com.example.Light;

public class YellowLight extends Light{
	
	Direction dir;
	public YellowLight(String id,Direction direction) {
		super(State.YELLOW, id,direction);
		this.dir = direction;
	}

	@Override
	public Light changeState() {
		return new RedLight(this.getId(),this.dir);
	}


}
