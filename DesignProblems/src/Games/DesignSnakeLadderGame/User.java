package Games.DesignSnakeLadderGame;

import java.util.UUID;

public class User {
	private String name;
	private int uuid;
	
	public User(String name, int uuid) {
		super();
		this.name = name;
		this.uuid = uuid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUuid() {
		return uuid;
	}
	public void setUuid(int uuid) {
		this.uuid = uuid;
	}
	
	public Player getPlayer() {
		return new Player(this);
	}
}
