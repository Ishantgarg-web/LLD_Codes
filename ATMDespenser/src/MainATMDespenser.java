
/**
 * 
 * @author ishant
 * This project is used for basics of LLD Conceptual Class.
 * In this we will make ATM Despenser which is using Chain Responsibility.
 */

public class MainATMDespenser {
	public static void main(String[] args) {
		Despenser atmDespenser = new ThousandDespenser(new FiveHundredDespenser(new HundredDespenser(new FiftyDespenser(null))));
		atmDespenser.process(5555);
	}
}
