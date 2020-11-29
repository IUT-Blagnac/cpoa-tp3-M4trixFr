public abstract class Pizzeria {
    protected PizzaFactory PizzaFactory;
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