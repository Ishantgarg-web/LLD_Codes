package com.example.mementoDesignPattern;

public class PersonOriginator {
	
	private String name;
	private String email;
	private int weight;
	
	public PersonOriginator(String name, String email, int weight) {
		this.name = name;
		this.email = email;
		this.weight = weight;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return this.weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public Memento createMemento() {
		return new Memento(this.name, this.weight);
	}
	
	public void restoreMemento(Memento memento) {
		this.name = memento.getName();
		this.weight = memento.getWeight();
	}
}
