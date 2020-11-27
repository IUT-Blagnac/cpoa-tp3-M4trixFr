
public class PizzaBrestFactory extends PizzaFactory {

	private static PizzaBrestFactory uniqueInstance;
	
	private PizzaBrestFactory() {
		
	}
	
	public static PizzaBrestFactory getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new PizzaBrestFactory();
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
