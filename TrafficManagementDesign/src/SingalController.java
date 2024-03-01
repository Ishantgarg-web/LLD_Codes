import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SingalController {
	
	Deque<Signal> dq;
	public SingalController() {
		dq = new ArrayDeque<>();
	}
	
	public void start(List<Signal> signals) throws InterruptedException {
		/**
		 * Added all signals to ArrayDeque.
		 */
		for (Signal s: signals) {
			dq.add(s);
		}
		while(true) {
			/**
			 * Now, we will remove 1 signal each time from deque and do the operations.
			 */
			Signal currentSignal = dq.pollFirst();
			/**
			 * turnOff means it will change into YellowSignal and after given time, it will change into RED.
			 */
			currentSignal.turnOff();
			Signal newSignal = dq.peekFirst();
			/**
			 * Now, we turnOn newSignal, it will immediately change into Green.
			 */
			newSignal.turnOn();
			dq.addLast(currentSignal);
		}
	}
}
