package com.example.commandDesignPattern.commands;

import com.example.commandDesignPattern.commands.light.Light;
import com.example.commandDesignPattern.commands.light.LightOffCommand;
import com.example.commandDesignPattern.commands.light.LightOnCommand;

public class Main {
	public static void main(String[] args) {
		Invoker remoteControl = new Invoker();
		
		Light livingArea = new Light("Living Area");
		
		LightOnCommand lightOnCommand = new LightOnCommand(livingArea);
		LightOffCommand lightOffCommand = new LightOffCommand(livingArea);
		
		remoteControl.setSlot(0, new Slot(lightOnCommand, lightOffCommand));
		
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		remoteControl.undoButtonWasPushed();
	}
}
