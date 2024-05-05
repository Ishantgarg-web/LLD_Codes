package Games.DesignSnakeLadderGame;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		Board b = new Board(100);
		
		b.addJumper(1, 38); // Ladder
		b.addJumper(4, 14); // Ladder
		b.addJumper(8, 10); // Ladder
		b.addJumper(21, 42); // Ladder
		b.addJumper(28, 76); // Ladder
		b.addJumper(32, 10); // Snake
		b.addJumper(36, 6); // Snake
		b.addJumper(48, 26); // Snake
		b.addJumper(50, 67); // Ladder
		b.addJumper(62, 18); // Snake
		b.addJumper(71, 92); // Ladder
		b.addJumper(80, 99); // Ladder
		b.addJumper(88, 24); // Snake
		b.addJumper(95, 56); // Snake
		b.addJumper(97, 78); // Snake
		
	
		User u1 = new User("user1", 1);
		User u2 = new User("user2", 2);
		User u3 = new User("user3", 3);
		
		Game g = new Game(Arrays.asList(u1, u2, u3), b, new NormalDice());
		User winner = g.startGame();
		System.out.println("Winner of this game: "+winner.getName());
	}
}
