package com.example.models;

import com.example.Pieces.Color;

public class Player {
	private int id;
	private String name;
	private Color color;
	
	public Player(int id, String name, Color color) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Color getColor() {
		return color;
	}
	
	
}
