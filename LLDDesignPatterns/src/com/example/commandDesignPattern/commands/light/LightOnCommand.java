package com.example.commandDesignPattern.commands.light;

import com.example.commandDesignPattern.commands.Command;

public class LightOnCommand implements Command{
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		System.out.println("Turning on: "+light.getPlace());
		this.light.on();
	}
	
	@Override
	public void undo() {
		System.out.println("Turning off: "+light.getPlace());
		this.light.off();
	}

}
