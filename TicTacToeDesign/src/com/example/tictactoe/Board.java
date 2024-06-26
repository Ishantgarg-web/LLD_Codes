package com.example.tictactoe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Board {
	private PieceType board[][];
	
	private int size;
	
	/**
	 * rowFreqMap, colFreqMap: both maps are used to only maintain frequency
	 * of each PieceType in each row and columns.
	 * 
	 * same for diagonals.
	 */
	private final List<HashMap<Integer, Integer>> rowFreqMap, colFreqMap;
	private final HashMap<Integer, Integer> mainDiagonalFreqMap;
	private final HashMap<Integer, Integer> offDiagonalFreqMap;
	
	public Board(int size) {
		this.board = new PieceType[size][size];
		this.size = size;
		rowFreqMap = new ArrayList<>();
		colFreqMap = new ArrayList<>();
		mainDiagonalFreqMap = new HashMap<>();
		offDiagonalFreqMap = new HashMap<>();
		
		for (int i=0;i<size;i++) {
			rowFreqMap.add(new HashMap<>());
			colFreqMap.add(new HashMap<>());
		}
	}
	
	public PieceType[][] getBoard() {
		return board;
	}

	public int getSize() {
		return size;
	}

	public void print() {
		/**
		 * This will print the current state of board.
		 */
		for (int i=0;i<this.size;i++) {
			for (int j=0;j<this.size;j++) {
				if(this.board[i][j]==null) {
					System.out.print("0"+" ");
				}else {
					System.out.print(this.board[i][j].getValue()+" ");
				}
			}
			System.out.println();
		}
	}
	/**
     * This function takes the user input and try to make that move on the board. Throw exception if there are invalid
     * argument. and return true if current player win the game after this move.
     *
     * @param move represents a move made by the given player.
     * @return true if current player win the game after this move, else false.
     * @throws IllegalArgumentException if x and y aren't valid. or some piece is already there on given position.
     */
	public boolean playMove(Move move) {
		int x = move.getX();
		int y = move.getY();
		Player player = move.getPlayer();
		//System.out.println("this move is for x: "+x+" y: "+y+" and player is: "+player.getName());
		if(x<0 || x>=this.getSize()) {
			throw new IllegalArgumentException("row move is not valid");
		}
		if(y<0 || y>=this.getSize()) {
			throw new IllegalArgumentException("column move is not valid");
		}
		/**
		 * Check if given position is already filled.
		 */
		if(this.board[x][y]!=null) {
			throw new IllegalArgumentException("Given position is already filled");
		}
		
		int pieceValue = player.getPieceType().getValue();
		this.board[x][y] = player.getPieceType();
		
		rowFreqMap.get(x).put(pieceValue, rowFreqMap.get(x).getOrDefault(pieceValue, 0)+1);
		colFreqMap.get(y).put(pieceValue, colFreqMap.get(y).getOrDefault(pieceValue, 0)+1);
		
		if(x==y) {
			mainDiagonalFreqMap.put(pieceValue, mainDiagonalFreqMap.getOrDefault(pieceValue, 0)+1);
		}
		if(y==this.getSize()-1-x) {
			offDiagonalFreqMap.put(pieceValue, offDiagonalFreqMap.getOrDefault(pieceValue, 0)+1);
		}
		
		// player will only be considered as won if any of the condition met.
        // 1. If freq of piece value in the row that corresponds to (x, y) is equal to size.
		if(rowFreqMap.get(x).getOrDefault(pieceValue, 0) == this.getSize()) {
			return true;
		}
        // 2. If freq of piece value in the column that corresponds to (x, y) is equal to size.
		if(colFreqMap.get(y).getOrDefault(pieceValue, 0) == this.getSize()) {
			return true;
		}
        // 3. If freq of piece value in the main diagonal that corresponds to (x, y) is equal to size.
		if(x==y && mainDiagonalFreqMap.getOrDefault(pieceValue, 0) == this.getSize()) {
			return true;
		}
        // 4. If freq of piece value in the off diagonal that corresponds to (x, y) is equal to size.
		if(y==this.getSize()-1-x && offDiagonalFreqMap.getOrDefault(pieceValue, 0) == this.getSize()) {
			return true;
		}
		return false;
	}
	
	/**
	 * This method is used for doing undo operation.
	 */
	public void undo(Move move) {
		int x = move.getX();
		int y = move.getY();
		Player player = move.getPlayer();
		
		// set the x and y to null.
		this.board[x][y] = null;
		System.out.println(this.board);
		// Now, reduce the count in rowFreqMap, colFreqMap, mainDiagonalFreqMap, and offDiagonalFreqMap.
		rowFreqMap.get(x).put(player.getPieceType().getValue(), rowFreqMap.get(x).get(player.getPieceType().getValue())-1);
		// Now, reduct the count in colFreqMap.
		colFreqMap.get(y).put(player.getPieceType().getValue(), colFreqMap.get(y).get(player.getPieceType().getValue())-1);
		if(x==y) {
			// Now, reduce the count in maindiagonalFreqMap.
			mainDiagonalFreqMap.put(player.getPieceType().getValue(), mainDiagonalFreqMap.get(player.getPieceType().getValue())-1);
		}
		if(x==this.getSize()-1-y) {
			// Now, reduce the count in offdiagonalFreqMap.
			offDiagonalFreqMap.put(player.getPieceType().getValue(), offDiagonalFreqMap.get(player.getPieceType().getValue())-1);
		}
	}
}
