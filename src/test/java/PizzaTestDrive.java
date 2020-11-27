public class PizzaTestDrive {

    public static void main(String[] args) {

        Pizzeria boutiqueBrest = PizzeriaFabrique.getInstance().creerPizzeria("Brest");
        Pizzeria boutiqueStrasbourg = PizzeriaFabrique.getInstance().creerPizzeria("Strasbourg");

        Pizza pizza = boutiqueBrest.commanderPizza("Fromage");
        System.out.println("JMB a command� une " + pizza.getNom() + "\n");

        pizza = boutiqueStrasbourg.commanderPizza("Fromage");
        System.out.println("JMI a command� une " + pizza.getNom() + "\n");

    }

}

