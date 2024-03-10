package com.example.mementoDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CareTaker {
	private List<Memento> mementoHistory;
	
	public CareTaker() {
		this.mementoHistory = new ArrayList<>();
	}
	
	public void addMemento(Memento memento) {
		this.mementoHistory.add(memento);
		System.out.println("Given memento added successully");
	}
	
	public void getMemetoHistory(){
		System.out.println("**** All Mementos *****");
		for (Memento memento: this.mementoHistory) {
			System.out.println(memento);
		}
	}
	
	public void getMementoByIndex(int n) {
		// it will return last n memento/snapshots
		List<Memento> allMementos = this.mementoHistory;
		int len = (allMementos.size()>n)?(allMementos.size()-n):0;
		for (int i = len;i<allMementos.size();i++) {
			System.out.println(allMementos.get(i));
		}
	}
}
