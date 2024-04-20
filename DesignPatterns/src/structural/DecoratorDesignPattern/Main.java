package structural.DecoratorDesignPattern;

public class Main {
	public static void main(String[] args) {
		Pizza pizza = new BasePizza();
		pizza = new PaneerPizza(pizza);
		pizza = new CheesePizza(pizza);
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}
}
