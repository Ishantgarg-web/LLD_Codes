package com.example.mementoDesignPattern;

/**
 * 
 * @author ishant
 * This design pattern helps in storing snapshot at multiple checkpoints so, that we can restore
 * a particular snapshot.
 */

public class Main {
	public static void main(String[] args) {
		PersonOriginator person1 = new PersonOriginator("ishant","ishant@gmail.com",200);
		CareTaker careTaker = new CareTaker();
		careTaker.addMemento(person1.createMemento());
		
		person1.setName("sahil");
		careTaker.addMemento(person1.createMemento());
//		careTaker.getMemetoHistory();
		careTaker.getMementoByIndex(1);
	}
}
