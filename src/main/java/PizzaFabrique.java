

public abstract class PizzaFabrique {
	public static Pizza creerPizza(String type) {
		Pizza pizza = null;
		if (type.equals("Fromage")) {
		  pizza = new PizzaFromageStyleBrest();
		} else if (type.equals("Savoyarde")) {
		  pizza = new PizzaSavoyardeStyleBrest();
		} else if (type.equals("Savoyarde")) {
		  pizza = new PizzaCustomStyleBrest();
		}
		return pizza;
	}

}
