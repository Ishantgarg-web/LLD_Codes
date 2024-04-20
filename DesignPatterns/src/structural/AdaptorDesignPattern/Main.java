package structural.AdaptorDesignPattern;

public class Main {
	public static void main(String[] args) {
		Document voterid = new VoterId("ishant", "sharma", 24);
		
		System.out.println(voterid.getFirstName());
		System.out.println(voterid.getLastName());
		System.out.println(voterid.getAge());
		
		/**
		 * Now, this DocumentAdaptor help us to extend the RationCard to Document interface.
		 */
		Document rationCard = new DocumentAdaptor(new RationCard("deepak kumar", 30));
		System.out.println(rationCard.getFirstName());
		System.out.println(rationCard.getLastName());
		System.out.println(rationCard.getAge());
	}
}
