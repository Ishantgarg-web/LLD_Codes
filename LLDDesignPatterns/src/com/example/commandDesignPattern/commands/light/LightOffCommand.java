package com.example.commandDesignPattern.commands.light;

import com.example.commandDesignPattern.commands.Command;

public class LightOffCommand implements Command{

	private Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		System.out.println("Turning off Light: "+light.getPlace());
		this.light.off();
	}

	@Override
	public void undo() {
		System.out.println("Turning on Light: "+light.getPlace());
		this.light.on();
	}

}
