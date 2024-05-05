package Games.DesignSnakeLadderGame;

public class Player {
	private User user;
	private int position;
	
	private static final int INITIAL_POSITION_PLAYER = 0;

	public Player(User user) {
		super();
		this.user = user;
		this.position = INITIAL_POSITION_PLAYER;
	}
	public User getUser() {
		return user;
	}
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
}
