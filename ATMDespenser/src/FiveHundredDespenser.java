

public class FiveHundredDespenser extends Despenser{

	public FiveHundredDespenser(Despenser despenser) {
		super.nextDespenser(despenser);
	}
	
	public void process(int amount) {
		int notes = amount/500;
		if(notes!=0) {
			System.out.println(notes+" notes of 500 Rs.");
			
		}
		int leftAmount = amount%500;
		super.process(leftAmount);
	}

}
