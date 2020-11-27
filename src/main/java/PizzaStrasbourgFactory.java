
public class PizzaStrasbourgFactory extends PizzaFactory {

	private static PizzaStrasbourgFactory uniqueInstance;
	
	private PizzaStrasbourgFactory() {
		
	}
	
	public static PizzaStrasbourgFactory getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new PizzaStrasbourgFactory();
		}
		return uniqueInstance;
	}
	
	public Pizza creerPizza(String name) {
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
