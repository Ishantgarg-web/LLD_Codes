package com.example.Pieces;

import com.example.models.Move;

public class King extends Piece{
	
	public King(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidMove(Move move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PieceType getPieceType() {
		return PieceType.KING;
	}

}
