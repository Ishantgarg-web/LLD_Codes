package com.example.Pieces;

import com.example.models.Move;

public class Bishop extends Piece{

	public Bishop(Color color) {
		super(color);
	}

	@Override
	public boolean isValidMove(Move move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PieceType getPieceType() {
		return PieceType.BISHOP;
	}

}
