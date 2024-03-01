package com.example.Light;

import java.util.UUID;

public class RedLight extends Light{
	
	Direction dir;
	public RedLight(String id,Direction direction) {
		super(State.RED, id,direction);
		this.dir = direction;
	}
	
	@Override
	public Light changeState() {
		return new GreenLight(this.getId(),this.dir);
	}
	
}
