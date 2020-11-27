public abstract class Pizzeria {
	
	public final Pizza commanderPizza(String type) {
		Pizza pizza;
		pizza = PizzaFabrique.creerPizza(type);
		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();
		return pizza;
	}

}