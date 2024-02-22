
public class ThousandDespenser extends Despenser{

	public ThousandDespenser(Despenser despenser) {
		super.nextDespenser(despenser);
	}
	
	public void process(int amount) {
		int notes = amount/1000;
		if(notes!=0) {
			System.out.println(notes+" notes of 1000 Rs.");
			
		}
		int leftAmount = amount%1000;
		super.process(leftAmount);
	}
	
}
