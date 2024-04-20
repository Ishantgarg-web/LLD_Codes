package structural.AdaptorDesignPattern;

/**
 * 
 * @author ishant
 * This is legacy class. According to SOLID priciples, we can not modify it, we can only extend it
 * and make it adaptable for Document interface. So, that client can use in better way.
 */

public class RationCard {
	private String fullName;
	private int age;
	
	public RationCard(String fullName, int age) {
		super();
		this.fullName = fullName;
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}
	
	
}
