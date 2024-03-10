package com.example.iteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class VehicleIterator implements Iterator{
	
	private Stack<Vehicle> vehicles;
	
	private int index;
	
	public VehicleIterator() {
		this.vehicles = new Stack<>();
		this.index = -1;
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	@Override
	public boolean hasNext() {
		if(this.index < this.vehicles.size()-1) {
			return true;
		}
		return false;
	}

	@Override
	public Object next() {
		if(this.hasNext()) {
			this.index = this.index+1;
			return this.vehicles.get(this.index);
		}
		return null;
	}
	
}
