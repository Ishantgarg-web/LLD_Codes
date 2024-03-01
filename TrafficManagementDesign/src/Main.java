import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.Light.Direction;
import com.example.Light.GreenLight;
import com.example.Light.RedLight;

/**
 * 
 * @author ishant
 * This is completed.
 * This is basically changes from Green -> Yellow -> Red -> Green.
 */

public class Main {
	public static void main(String[] args) throws InterruptedException {
		GreenLight light1 = new GreenLight("1",Direction.LEFT);
		GreenLight light2 = new GreenLight("2",Direction.STRAIGHT);
		GreenLight light3 = new GreenLight("3",Direction.RIGHT);
		RedLight light4 = new RedLight("4",Direction.LEFT);
		RedLight light5 = new RedLight("5",Direction.STRAIGHT);
		RedLight light6 = new RedLight("6",Direction.RIGHT);
		RedLight light7 = new RedLight("7",Direction.LEFT);
		RedLight light8 = new RedLight("8",Direction.STRAIGHT);
		RedLight light9 = new RedLight("9",Direction.RIGHT);
		RedLight light10 = new RedLight("10",Direction.LEFT);
		RedLight light11 = new RedLight("11",Direction.STRAIGHT);
		RedLight light12 = new RedLight("12",Direction.RIGHT);
		
		Signal signal1 = new Signal(Arrays.asList(light1, light2, light3), "s1", 10);
		Signal signal2 = new Signal(Arrays.asList(light4, light5, light6), "s2", 10);
		Signal signal3 = new Signal(Arrays.asList(light7, light8, light9), "s3", 10);
		Signal signal4 = new Signal(Arrays.asList(light10, light11, light12), "s4", 10);
		
		SingalController sg = new SingalController();
		List<Signal> al = new ArrayList<>();
		al.add(signal1);
		al.add(signal2);
		al.add(signal3);
		al.add(signal4);
		
		sg.start(al);
	}
}
