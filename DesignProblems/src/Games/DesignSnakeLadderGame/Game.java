package Games.DesignSnakeLadderGame;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
	private final Queue<Player> players;
	private Board board;
	private IDice dice;
	
	public Game(List<User> users, Board board, IDice dice) {
		Queue<Player> q = new LinkedList<>();
		for (User user: users) {
			q.add(user.getPlayer());
		}
		this.players = q;
		this.board = board;
		this.dice = dice;
	}
	
	public User startGame() {
		/**
		 * Game will be continue till:
		 * -> we would not find winner for this game.
		 */
		while(true) {
			Player currentPlayer = getNextPlayerTurn();
			System.out.println("Current player turn: "+currentPlayer.getUser().getName());
			int diceResult = this.dice.roll();
			System.out.println("diceResult is: "+diceResult);
			// Now, we will get newPosition for this player.
			int newPos = this.board.getPlayerNewPosition(currentPlayer.getPosition(), diceResult);
			System.out.println("Current player position is: "+currentPlayer.getPosition()+ "and newPos is: "+newPos);
			currentPlayer.setPosition(newPos);
			// Now, we will check is this winner position or not.
			if(newPos == this.board.getSize()) {
				// it means, this player is winner.
				return currentPlayer.getUser();
			}
		}
	}

	private Player getNextPlayerTurn() {
		/**
		 * We will get first player from queue and add this removed player to the end of queue.
		 */
		Player currPlayer = this.players.poll();
		this.players.add(currPlayer);
		return currPlayer;
	}
	
}
