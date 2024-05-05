package Games.DesignSnakeLadderGame;

import java.util.HashMap;

public class Board {
	private final int size;
	private final HashMap<Integer, Integer> jumpers = new HashMap<>();
	
	public Board(int size) {
		super();
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean addJumper(int start,int end) {
		if(isValidJumper(start, end)) {
			this.jumpers.put(start, end);
			return true;
		}
		return false;
	}
	
	public boolean isValidJumper(int start,int end) {
		/**
		 * Conditions for adding Jumper:
		 * -> jumper startpoint and endpoint should be in range[0,boardsize]
		 * -> Combinations like(startPoint, endPoint) and (endPoint, startPoint) should not present in jumpers
		 *    hashmap.
		 */
		if(start<0 || start>this.size || end<0 || end>this.size) {
			return false;
		}
		if(jumpers.containsKey(start) || jumpers.containsKey(end)) {
			return false;
		}
		return true;
	}

	public int getPlayerNewPosition(int position, int diceResult) {
		/**
		 * Here, we will return newPosition for this player.
		 */
		int newPosition = position + diceResult;
		if(newPosition > size) {
			// In this case, we will return currentPosition for this player.
			return position;
		}
		return (this.jumpers.containsKey(newPosition))?this.jumpers.get(newPosition):newPosition;
	}
	
}
