package Games.DesignSnakeLadderGame;

import java.util.Random;

public class NormalDice implements IDice{
	
	private static final int DICE_MAX_NUMBER = 6;
	
	@Override
	public int roll() {
		Random random = new Random();
		return random.nextInt(DICE_MAX_NUMBER) + 1;
	}

}
