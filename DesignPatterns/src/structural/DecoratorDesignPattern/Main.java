package structural.DecoratorDesignPattern;

/**
 * 
 * @author ishant
 * this is used to modify the functionality of object at runtime.
 * In this case, we can add multiple toppings of Pizza with extensible no need to create multiple classes
 * for each combination.
 */

public class Main {
	public static void main(String[] args) {
		Pizza pizza = new BasePizza();
		pizza = new PaneerPizza(pizza);
		pizza = new CheesePizza(pizza);
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}
}
