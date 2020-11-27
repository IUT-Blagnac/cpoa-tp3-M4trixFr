
public class FabriquePizzaBrest extends PizzaFabrique{

	private static FabriquePizzaBrest uniqueInstance;
	
	private FabriquePizzaBrest() {
		
	}
	
	public static FabriquePizzaBrest getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new FabriquePizzaBrest();
		}
		return uniqueInstance;
	}
	
	public static Pizza creerPizza(String name) {
		Pizza pizza = null;
		if(name.equals("Savoyarde")) {
			pizza = new PizzaSavoyardeStyleBrest();
		}else if(name.equals("Custom")) {
			pizza = new PizzaCustomStyleBrest();
		}else if(name.equals("Fromage")) {
			pizza = new PizzaFromageStyleBrest();
		}
		return pizza;
	}
}
