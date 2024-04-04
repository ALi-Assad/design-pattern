package store;

import pizza.Pizza;
import pizza_types.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.bake();

        return pizza;
    }

    public abstract Pizza createPizza(PizzaType type);
}
