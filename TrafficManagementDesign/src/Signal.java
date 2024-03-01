import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.example.Light.Light;
import com.example.Light.State;

public class Signal {
	
	private List<Light> trafficLights;
	private String id;
	private int timeInSec;
	
	public Signal(List<Light> trafficLights, String id, int timeInSec) {
		this.trafficLights = trafficLights;
		this.id = id;
		this.timeInSec = timeInSec;
	}
	
	public String getId() {
		return id;
	}
	
	public int getTimeInSec() {
		return timeInSec;
	}
	
	public List<Light> getTrafficLights() {
		return trafficLights;
	}
	
	public void setTrafficLights(List<Light> trafficLights) {
		this.trafficLights = trafficLights;
	}

	public void turnOff() throws InterruptedException {
		// change all the lights to yellow and after given time, to RED.
		List<Light> al = new ArrayList<>();
		for (Light light: this.trafficLights) {
			State fromState = light.getState();
			light = light.changeState();
			al.add(light);
			State toState = light.getState();
			System.out.println("Changed state of light"+light.getId()+" from "+fromState+" to "+toState);
		}
		Thread.sleep(this.timeInSec*1000);
		for (Light light: al) {
			State fromState = light.getState();
			light = light.changeState();
			State toState = light.getState();
			System.out.println("Changed state of light"+light.getId()+" from "+fromState+" to "+toState);
		}
	}

	public void turnOn() {
		// change all the lights to green.
		List<Light> al = new ArrayList<>();
		for (Light light: this.trafficLights) {
			State fromState = light.getState();
			light = light.changeState();
			al.add(light);
			State toState = light.getState();
			System.out.println("Changed state of light"+light.getId()+" from "+fromState+" to "+toState);
		}
		this.trafficLights = al;
	}
}
