package test;


import pizza_types.PizzaType;
import store.ChicagoStore;
import store.NYPStore;
import store.PizzaStore;

public class OrderPizza {

    public static void main(String[] argus) {

        PizzaStore store = new NYPStore();
        store.orderPizza(PizzaType.CHEESE);
        System.out.println("----------");
        store = new ChicagoStore();
        store.orderPizza(PizzaType.PEPPERONI);

    }
}
