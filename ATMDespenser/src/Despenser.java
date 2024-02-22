
public abstract class Despenser {
	
	private Despenser nextDespenser;
	
	public void nextDespenser(Despenser nextDespenser) {
		this.nextDespenser = nextDespenser;
	}
	
	public void process(int amount) {
		if(nextDespenser!=null) {
			this.nextDespenser.process(amount);
		}else {
			if(amount!=0) {
				System.out.println("We can not process the given amount");
			}
		}
	}
}
