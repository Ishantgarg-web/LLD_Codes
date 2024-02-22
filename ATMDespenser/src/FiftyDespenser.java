
public class FiftyDespenser extends Despenser{

	public FiftyDespenser(Despenser despenser) {
		this.nextDespenser(despenser);
	}
	
	public void process(int amount) {
		int notes = amount/50;
		if(notes!=0) {
			System.out.println(notes+" notes of 50 Rs.");
		}
		super.process(amount%50);
	}
}
