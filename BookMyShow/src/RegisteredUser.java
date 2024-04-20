import java.util.ArrayList;
import java.util.List;

public class RegisteredUser extends User{
	private List<Ticket> bookingHistory;
	
	private boolean isLoggedin;
	
	public RegisteredUser(String name) {
		super(name);
		this.isLoggedin = false;
	}
	
	public void Login(String email, String pass) {
		this.isLoggedin = true;
	}
}
