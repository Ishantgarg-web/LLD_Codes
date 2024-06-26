package structural.AdaptorDesignPattern;

public class VoterId implements Document{
	
	private String firstName;
	private String lastName;
	private int age;
	

	public VoterId(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public int getAge() {
		return this.age;
	}

}
