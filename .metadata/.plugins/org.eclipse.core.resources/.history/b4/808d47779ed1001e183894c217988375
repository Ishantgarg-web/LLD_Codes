package com.example.tictactoe;

import java.util.Arrays;

/**
 * 
 * @author ishant
 * General functionality completed.
 * undo operation pending.
 */

public class Main {
	public static void main(String args[]) {
		User a = new User("ishant");
		User b = new User("sahil");
		
		Game game = new Game(3, Arrays.asList(a,b));
		User winner = game.start();
		
		if(winner == null) {
			System.out.println("Its a draw");
		}else {
			System.out.println("Winner of this game is: "+winner.getName());
		}
	}
}
