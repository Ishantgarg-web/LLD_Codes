package com.example.Pieces;

import com.example.models.Move;

public class Knight extends Piece{

	public Knight(Color color) {
		super(color);
	}

	@Override
	public boolean isValidMove(Move move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PieceType getPieceType() {
		return PieceType.KNIGHT;
	}

}
