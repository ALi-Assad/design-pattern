package test;

import factory.ChicagoPizzaFactory;
import factory.NYPizzaFactory;
import pizza_types.PizzaType;
import store.PizzaStore;

public class OrderPizza {

    public static void main(String[] argus) {

        PizzaStore pizzaStore = new PizzaStore(new ChicagoPizzaFactory());
        pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("----------");
        pizzaStore = new PizzaStore(new NYPizzaFactory());
        pizzaStore.orderPizza(PizzaType.CLAM);
    }
}
