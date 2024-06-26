package com.example.tictactoe;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.UUID;

public class Game {
	private Board board;
	
	private Deque<Player> players;
	
	private Stack<Move> movesHistory;
	
	private UUID gameId;
	
	private Player winnerPlayer;
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public Game(int boardSize, List<User> users) {
		this.board = new Board(boardSize);
		this.players = new ArrayDeque<>();
		this.movesHistory = new Stack<>();
		this.gameId = UUID.randomUUID();
		
		for (int i=0;i<users.size();i++) {
			players.add(new Player(users.get(i), new PieceType(i+1)));
		}
	}
	
	/**
     * This function is responsible for keeping the game state and let the player make chance accordingly and decided
     * the winner. Time complexity of each operation is as follows.
     * player making a move- O(1)
     * deciding whether game is over after each step is also O(1)
     *
     * @return the winner of the game. if it's a draw. it will return null.
     */
	public User start() {
		int totalMoves = this.board.getSize()*this.board.getSize();
		while(totalMoves>0) {
			/**
			 * it is reducing totalMoves by 1.
			 */
			totalMoves = totalMoves - 1;
			Player turn = players.pop();
			
			// let the player know about their chance.
            System.out.printf("%s it's your chance. place %d on the board\n", turn.getName(), turn.getPieceType().getValue());
            this.board.print();
            
            while (true) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                try {
                    if (board.playMove(new Move(x, y, turn))) {
                        turn.getUser().incrementWins();
                        movesHistory.push(new Move(x, y, turn));
                        this.winnerPlayer = turn;
                        return turn.getUser();
                    }
                    movesHistory.push(new Move(x, y, turn));
                    
                    /**
                     * Here, we can ask user, if user want to undo its last move or not.
                     */
                    System.out.println(turn.getName()+" want to undo? if yes type 1 else 0");
                    int isUndo = scanner.nextInt();
                    if(isUndo == 1) {
                    	/**
                    	 * it means, users want to do undo.
                    	 * we will pop out top element from stack and revert that operation
                    	 * to 0
                    	 */
                    	Move lastMove = movesHistory.pop();
                    	board.undo(lastMove);
                    }else {
                    	break;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid move. " + e.getMessage() + "\n Try again !");
                }
            }
            players.add(turn);
		}
		return null;
	}
	
}
