
public class GuestUser extends User{

	private boolean isRegister;
	public GuestUser(String name) {
		super(name);
		isRegister = false;
	}
	
	public void registerUser(String name,String email,String pass) {
		this.isRegister = true;
	}
	
}
