package com.example.models;

import com.example.Pieces.Bishop;
import com.example.Pieces.Color;
import com.example.Pieces.King;
import com.example.Pieces.Knight;
import com.example.Pieces.Pawn;
import com.example.Pieces.Piece;
import com.example.Pieces.PieceType;
import com.example.Pieces.Queen;
import com.example.Pieces.Rook;

/*
   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
---------------------------------
0  | R | K | B | Q | K | B | K | R |
---------------------------------
1  | A | A | A | A | A | A | A | A |
---------------------------------
2  |   |   |   |   |   |   |   |   |
---------------------------------
3  |   |   |   |   |   |   |   |   |
---------------------------------
4  |   |   |   |   |   |   |   |   |
---------------------------------
5  |   |   |   |   |   |   |   |   |
---------------------------------
6  | B | B | B | B | B | B | B | B |
---------------------------------
7  | R | K | B | Q | K | B | K | R |
---------------------------------
*/


public class Board {
	public static final int size = 8;
	private Cell[][] board;
	
	public Cell[][] getBoard() {
		return board;
	}
	
	public Board(Player playerA, Player playerB) {
		/**
		 * Here, we are setting the Board.
		 * the pieces are placed as follows: rook, knight, bishop, queen, king, bishop, knight, rook
		 *
		 */
		
		this.board = new Cell[size][size];
		
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				board[i][j] = new Cell();
			}
		}
		for (int i=0;i<size;i++) {
			board[1][i] = new Cell(new Pawn(playerA.getColor()));
			board[6][i] = new Cell(new Pawn(playerB.getColor()));
		}
		// for Rook
		board[0][0] = new Cell(new Rook(playerA.getColor()));
		board[0][7] = new Cell(new Rook(playerA.getColor()));
		board[7][0] = new Cell(new Rook(playerB.getColor()));
		board[7][7] = new Cell(new Rook(playerB.getColor()));
		
		// for knight
		board[0][1] = new Cell(new Knight(playerA.getColor()));
		board[0][6] = new Cell(new Knight(playerA.getColor()));
		board[7][1] = new Cell(new Knight(playerB.getColor()));
		board[7][6] = new Cell(new Knight(playerB.getColor()));
		
		// for Bishop
		board[0][2] = new Cell(new Bishop(playerA.getColor()));
		board[0][5] = new Cell(new Bishop(playerA.getColor()));
		board[7][2] = new Cell(new Bishop(playerB.getColor()));
		board[7][5] = new Cell(new Bishop(playerB.getColor()));
		
		// for Queen
		board[0][3] = new Cell(new Queen(playerA.getColor()));
		board[7][3] = new Cell(new Queen(playerB.getColor()));
		
		// for King
		board[0][4] = new Cell(new King(playerA.getColor()));
		board[7][4] = new Cell(new King(playerB.getColor()));
		
		// all remaining cells are empty Piece type.
	}
	
	public Cell getCell(Cordinate cordinate) {
		// return the value for this cell.
		if(cordinate.getX() <0 || cordinate.getX()>=size || cordinate.getY()<0 || cordinate.getY()>=size) {
			return null;
		}
		return this.board[cordinate.getX()][cordinate.getY()];
	}
	
	public void setCell(Cordinate cordinate, Piece piece) {
		this.board[cordinate.getX()][cordinate.getY()].setPiece(piece);
	}
	
}
