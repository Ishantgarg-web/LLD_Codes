package com.example.Pieces;

import com.example.models.Move;

public class Pawn extends Piece{

	public Pawn(Color color) {
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
		return PieceType.PAWN;
	}

}
