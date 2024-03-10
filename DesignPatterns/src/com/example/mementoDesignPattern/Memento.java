package com.example.mementoDesignPattern;

public class Memento {
	
	private String name;
	
	private int weight;
	
	public Memento(String name, int weight) {
		this.name = name;
		this.weight = weight;
		System.out.println("Snapshot is created with given name: "+name+" and weight: "+weight);
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Memento [name=" + name + ", weight=" + weight + "]";
	}
	
}
