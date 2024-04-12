package com.example.commandDesignPattern.commands;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("No command is set for this slot");
	}

	@Override
	public void undo() {
		System.out.println("No command is set for this slot");
	}

}
