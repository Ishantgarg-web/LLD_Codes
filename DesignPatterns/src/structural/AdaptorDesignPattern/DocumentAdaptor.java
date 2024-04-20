package structural.AdaptorDesignPattern;

/**
 * 
 * @author ishant
 * This class is responsible for changing from 1 interface to other.
 */

public class DocumentAdaptor implements Document{
	
	private RationCard rationCard;
	public DocumentAdaptor(RationCard rationCard) {
		this.rationCard = rationCard;
	}
	
	@Override
	public String getFirstName() {
		return this.rationCard.getFullName().split(" ")[0];
	}

	@Override
	public String getLastName() {
		return this.rationCard.getFullName().split(" ")[1];
	}

	@Override
	public int getAge() {
		return this.rationCard.getAge();
	}
	
}
