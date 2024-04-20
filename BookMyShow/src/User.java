
public abstract class User {
	private int userId;
	private String name;
	private static int idCounter = 0;
	
	public User(String name) {
		super();
		idCounter+=1;
		this.userId = idCounter;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
