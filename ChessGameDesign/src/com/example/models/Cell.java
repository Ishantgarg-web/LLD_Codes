package com.example.models;

import com.example.Pieces.Piece;

public class Cell {
	private Piece piece;
	
	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Cell() {
		// TODO Auto-generated constructor stub
	}
	
	public Cell(Piece piece) {
		super();
		this.piece = piece;
	}


	public boolean isFree() {
		return piece == null;
	}
	
}
