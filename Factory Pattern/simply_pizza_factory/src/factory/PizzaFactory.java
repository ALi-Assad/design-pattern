package factory;

import pizza.*;
import pizza_types.PizzaType;

public abstract class PizzaFactory {

    public abstract Pizza createPizza(PizzaType type);
}
