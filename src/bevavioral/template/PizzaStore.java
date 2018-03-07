package bevavioral.template;

public class PizzaStore {

    public static void main(String[] args) {
        Pizza cheesePizza = new CheesePizza();
        Pizza pepperoniPizza = new PepperoniPizza();
        Pizza Margarita = new Margarita();

        Margarita.cookPizza();
    }
}
