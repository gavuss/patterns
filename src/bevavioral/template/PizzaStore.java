package bevavioral.template;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        Pizza pepperoniPizza = new PepperoniPizza();

        cheesePizza.cookPizza();
        System.out.println("\n==========================\n");
        pepperoniPizza.cookPizza();
    }
}
