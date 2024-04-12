package com.example.commandDesignPattern.commands;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Invoker {
	
	private List<Slot> slots;
	private Stack<Command> commandHistory;
	
	public Invoker() {
		slots = new ArrayList<>(7);
		for (int i=0;i<7;i++) {
			slots.add(new Slot(new NoCommand(), new NoCommand()));
		}
		this.commandHistory = new Stack<>();
	}
	
	public void setSlot(int idx, Slot slot) {
		this.slots.set(idx, slot);
	}
	
	public void onButtonWasPushed(int index) {
		this.slots.get(index).getOnCommand().execute();
		this.commandHistory.push(slots.get(index).getOnCommand());
	}
	
	public void offButtonWasPushed(int index) {
		this.slots.get(index).getOffCommand().execute();
		this.commandHistory.push(slots.get(index).getOffCommand());
	}
	
	public void undoButtonWasPushed() {
		if(commandHistory.isEmpty()) {
			System.out.println("undo can not be performed here");
		}else {
			Command lastCommand = this.commandHistory.pop();
			lastCommand.undo();
		}
	}
	
}
