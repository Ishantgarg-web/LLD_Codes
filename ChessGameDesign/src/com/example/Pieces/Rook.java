package com.example.Pieces;

import com.example.models.Move;

public class Rook extends Piece{

	public Rook(Color color) {
		super(color);
	}

	@Override
	public boolean isValidMove(Move move) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PieceType getPieceType() {
		return PieceType.ROOK;
	}

}
