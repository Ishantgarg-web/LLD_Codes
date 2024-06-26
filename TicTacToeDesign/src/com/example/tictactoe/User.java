package com.example.tictactoe;

import java.util.UUID;

public class User {
	private String name;
	
	private UUID uuid;
	
	private int winGamesCount;
	
	public User(String name) {
		this.name = name;
		this.uuid = UUID.randomUUID();
		this.winGamesCount = 0;
	}
	
	public String getName() {
		return name;
	}
	

	public int getWinGamesCount() {
		return winGamesCount;
	}

	public void incrementWins() {
		this.winGamesCount++;
	}
	
	
}
