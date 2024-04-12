package com.example.adaptorDesignPattern;

/**
 * 
 * @author ishant
 * In this adapator design pattern, we will changing format of one class that is extending interface1
 * to class2 that is extending interface2 internally, so that client does not know about internal
 * implementation.
 * 
 * Here, BirdAdaptor will convert given bird to Duck internally.
 */

public class AdaptorMain {
	public static void main(String[] args) {
		Bird bs = new BirdSparrow();
		bs.fly();
		bs.makeSound();
		
		Duck dc = new ToyDuck();
		dc.squeek();
		
		BirdAdaptor ba = new BirdAdaptor(bs);
		ba.squeek();
	}
}
