/**
 * @author bruel (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public class Pizzeria {

        /**
         * @param type
         * @return a Pizza object according to the type
         */
		public Pizza commanderPizza(String type) {

		Pizza pizza;
		
		if (type.equals("fromage")) {
			pizza = new PizzaFromage();
		} else if (type.equals("grecque")) {
			pizza = new PizzaGrecque();
		} else {
			pizza = new PizzaPoivrons();
		}

		pizza.preparer();
		pizza.cuire();
		pizza.couper();
		pizza.emballer();

		return pizza;
		}
}