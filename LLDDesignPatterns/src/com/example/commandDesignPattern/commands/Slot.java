package com.example.commandDesignPattern.commands;

public class Slot {
	
	private Command onCommand, offCommand;

	public Slot(Command onCommand, Command offCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	public Command getOnCommand() {
		return onCommand;
	}
	
	public Command getOffCommand() {
		return offCommand;
	}
}
