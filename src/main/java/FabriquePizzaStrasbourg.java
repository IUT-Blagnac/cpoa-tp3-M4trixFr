
public class FabriquePizzaStrasbourg extends PizzaFabrique{

	private static FabriquePizzaStrasbourg uniqueInstance;
	
	private FabriquePizzaStrasbourg() {
		
	}
	
	public static FabriquePizzaStrasbourg getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new FabriquePizzaStrasbourg();
		}
		return uniqueInstance;
	}
	
	public static Pizza creerPizza(String name) {
		Pizza pizza = null;
		if(name.equals("Savoyarde")) {
			pizza = new PizzaSavoyardeStyleStrasbourg();
		}else if(name.equals("Custom")) {
			pizza = new PizzaCustomStyleStrasbourg();
		}else if(name.equals("Fromage")) {
			pizza = new PizzaFromageStyleStrasbourg();
		}
		return pizza;
	}
}
