package com.example.models;

import java.util.Scanner;

import com.example.Pieces.Piece;

public class GameController {
	private Game game;
	
	private static Scanner input = new Scanner(System.in);
	
	public Player start(Player playerA, Player playerB) {
		game = new Game(playerA, playerB);
		
		while(true) {
			Player playerTurn = game.getPlayerTurn();
			System.out.printf("It's %s turn, Enter start and end coordinates- \n", playerTurn.getName());
			Move move = getMoveInput();
			while(!isValidMove(move, playerTurn)) {
				System.out.println("Its not a valid move, please Try Again!!");
				move = getMoveInput();
			}
			// Now, we have move that this wants to move.
			movePiece(move);
			
			// Now, we set the turn for other player.
			this.game.setPlayerTurn(getNextPlayerTurn());
		}
	}

	private Player getNextPlayerTurn() {
		if(game.getPlayerTurn() == game.getPlayerA()) {
			return game.getPlayerB();
		}
		return game.getPlayerA();
	}

	private void movePiece(Move move) {
		/**
		 * We need to move this piece from given start cordinates to end cordinates.
		 * 
		 * Approach:
		 * Piece piece = take piece from start cordinates and make this empty.
		 * -> if end cordinates is empty:
		 * 		=> set this piece to end cordinates.
		 * -> 
		 * 		=> if at end cordinates, king is there it means, given player wins this game.
		 * 		=> else
		 * 			=> remove the existing piece from the end cordinates and place the start cordinates piece
		 *             there.
		 * 		
		 */
		// Condition 1:
		Cell[][] board  = this.game.getBoard().getBoard();
		Piece pieceAtStart = board[move.getStart().getX()][move.getStart().getY()].getPiece();
		// Now, make the start Cordinates null.
		this.game.getBoard().setCell(move.getStart(), null);
		
		// Condition 2:
		if(board[move.getEnd().getX()][move.getEnd().getY()] == null) {
			// it means, end cordinates is empty
			this.game.getBoard().setCell(move.getEnd(), pieceAtStart);
		}else {
			// it means, end cordinates is not empty
			this.game.getBoard().setCell(move.getEnd(), null);
			this.game.getBoard().setCell(move.getEnd(), pieceAtStart);
		}
	}

	private boolean isValidMove(Move move, Player playerTurn) {
		/**
		 * Conditions: for a invalid move.
		 * -> start and end cordinates not exist.
		 * -> start cordinates are empty or at start other player piece is there.
		 * -> end cordinates is not empty && at end, piece is of given playerTurn.
		 * -> if given piece at start cordinates not reachable to end cordinates - TODO
		 */
		// Condition 1:
		if(move.getStart().getX() < 0 || move.getStart().getX() >= this.game.getBoard().size ||
				move.getStart().getY() < 0 || move.getStart().getY() >= this.game.getBoard().size ||
				move.getEnd().getX() < 0 || move.getEnd().getX() >= this.game.getBoard().size ||
				move.getEnd().getY() < 0 || move.getEnd().getY() >= this.game.getBoard().size) {
			return false;
		}
		// Condition 2:
		Cell[][] board = this.game.getBoard().getBoard();
		if(board[move.getStart().getX()][move.getStart().getY()] == null) {
			return false;
		}
		Piece pieceAtStart = board[move.getStart().getX()][move.getStart().getY()].getPiece();
		if(pieceAtStart.getColor() != playerTurn.getColor()) {
			return false;
		}
		
		// Condition 3:
		if(board[move.getEnd().getX()][move.getEnd().getY()]!=null &&
				board[move.getEnd().getX()][move.getEnd().getY()].getPiece().getColor() == playerTurn.getColor()) {
			return false;
		}

		/**
		 * Condition 4:
		 * Piece piece = piece at start cordinates.
		 * boolean endFilled = if endCordinates are filled.
		 * if(piece is type pawn)
		 * 		if (playerA has turn):
		 * 			then it can move to (x+1,y) from (x,y)
		 *      	if(endFilled)
		 *    			then it can also move to (x+1,y-1) or (x+1,y+1)
		 *    	else:
		 *    		then it can move to (x-1,y) from (x,y)
		 *    		if(endFilled)
		 *    			then it can also move to (x-1,y-1) or (x-1,y+1)	
		 * else if(piece is of type Bishop)
		 * 		// A bishop moves any number of vacant squares diagonally.
		 * 		-> check in top-left diagonal.
		 * 			int currX = startX, currY = startY;
		 * 			while(currX>=0 && currY>=0){
		 * 				currX = currX-1;
		 * 				currY = currY-1;
		 * 				if(currX,currY matches with end cordinates)
		 * 					return true //valid move
		 * 				else if(currX, currY has a piece)
		 * 					return false // we can not reach to end.
		 * 		-> check in top-right diagonal
		 * 			int currX = startX, currY = startY;
		 * 			while(currX>=0 && currY<size){
		 * 				currX = currX-1;
		 * 				currY = currY+1;
		 * 				if(currX,currY matches with end cordinates)
		 * 					return true //valid move
		 * 				else if(currX, currY has a piece)
		 * 					return false // we can not reach to end.
		 * 		-> check in bottom-left diagonal
		 * 			int currX = startX, currY = startY;
		 * 			while(currX<size && currY>=0){
		 * 				currX = currX+1;
		 * 				currY = currY-1;
		 * 				if(currX,currY matches with end cordinates)
		 * 					return true //valid move
		 * 				else if(currX, currY has a piece)
		 * 					return false // we can not reach to end.
		 * 		-> check in bottom-right diagonal
		 * 			int currX = startX, currY = startY;
		 * 			while(currX<size && currY<size){
		 * 				currX = currX+1;
		 * 				currY = currY+1;
		 * 				if(currX,currY matches with end cordinates)
		 * 					return true //valid move
		 * 				else if(currX, currY has a piece)
		 * 					return false // we can not reach to end.
		 * 
		 * TODO: for remaining pieces.
		 */
	}

	private Move getMoveInput() {
		int startX = input.nextInt(),startY = input.nextInt(),endX = input.nextInt(), endY = input.nextInt();
		return new Move(new Cordinate(startX, startY), new Cordinate(endX, endY));
	}
	
}
