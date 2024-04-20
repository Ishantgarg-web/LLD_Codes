package com.example.DecoratorDesignPattern;

public class CheesePizza extends PizzaDecorator{

	public CheesePizza(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String getDescription() {
		return this.pizza.getDescription()+" Add on Cheese";
	}

	@Override
	public float getCost() {
		return this.pizza.getCost()+10.0f;
	}
	
	

}
