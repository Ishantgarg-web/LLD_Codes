package structural.DecoratorDesignPattern;

public class PaneerPizza extends PizzaDecorator{
	
	public PaneerPizza(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String getDescription() {
		return this.pizza.getDescription()+" Add on PaneerPizza";
	}

	@Override
	public float getCost() {
		return this.pizza.getCost()+50;
	}
	
}
