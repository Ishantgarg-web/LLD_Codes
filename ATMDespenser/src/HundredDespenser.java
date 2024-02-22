
public class HundredDespenser extends Despenser{

	public HundredDespenser(Despenser despenser) {
		super.nextDespenser(despenser);
	}
	
	public void process(int amount) {
		int notes = amount/100;
		if(notes!=0) {
			System.out.println(notes+" notes of 100 Rs.");
			
		}
		int leftAmount = amount%100;
		super.process(leftAmount);
	}
	
}
