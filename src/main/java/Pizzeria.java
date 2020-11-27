public abstract class Pizzeria {
	PizzaFactory pizzaFactory;
	protected Pizza commanderPizza(String type) {
		
		Pizza instance = pizzaFactory.creerPizza(type);
		instance.preparer();
		instance.cuire();
		instance.couper();
		instance.emballer();
		return instance;
	}

}