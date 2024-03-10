package com.example.iteratorDesignPattern;

/**
 * 
 * @author ishant
 * this design pattern is similiar to Iterator interface in collection chart. where each collection
 * can go through same Iterator.
 * 
 * In this Example, if you change collection to any other in VehicleIteraor class, it will not impact
 * client code.
 */

public class Main {
	public static void main(String[] args) {
		VehicleIterator iterator = new VehicleIterator();
		
		iterator.addVehicle(new Vehicle(11));
		iterator.addVehicle(new Vehicle(12));
		iterator.addVehicle(new Vehicle(13));
		iterator.addVehicle(new Vehicle(15));
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
