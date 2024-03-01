package com.example.Light;

import java.util.UUID;

public abstract class Light {
	private String id;
	
	public String getId() {
		return this.id;
	}

	protected State state;  // tell us color of a light
	
	protected Direction direction;

	public Light(State state, String id, Direction direction) {
		this.id = id;
		this.state = state;
		this.direction = direction;
	}

	public State getState() {
		return this.state;
	}

	public Direction getDirection() {
		return direction;
	}

	public abstract Light changeState();
	
//	public abstract void changeDirection();
}
