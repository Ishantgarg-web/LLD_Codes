package com.example.Pieces;

import com.example.models.Move;

public abstract class Piece {
	
	private Color color;
	
	private boolean isKilled;
	
	public boolean isKilled() {
		return isKilled;
	}

	public Piece(Color color) {
		this.color = color;
		this.isKilled = false;
	}
	
	public Color getColor() {
		return color;
	}
	
	
	
	public abstract boolean isValidMove(Move move);
	
	public abstract PieceType getPieceType();
}
