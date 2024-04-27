package com.example.models;

/**
 * 
 * @author ishant
 * According to the requirements, we give the playerA to the first turn always, we can also change it later.
 */

public class Game {
	
	private Board board;
	private Player playerA;
	private Player playerB;
	private Player playerTurn;
	
	public Game(Player playerA, Player playerB) {
		this.playerA = playerA;
		this.playerB = playerB;
		this.playerTurn = playerA;
		this.board = new Board(playerA, playerB);
	}

	public void setPlayerTurn(Player playerTurn) {
		this.playerTurn = playerTurn;
	}
	
	public Player getPlayerTurn() {
		return this.playerTurn;
	}
	
	public Player getPlayerA() {
		return playerA;
	}
	
	public Player getPlayerB() {
		return playerB;
	}
	
	public Board getBoard() {
		return this.board;
	}
}
