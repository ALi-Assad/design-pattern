package factory;

import pizza.*;
import pizza.NY.NYStyleCheesePizza;
import pizza.NY.NYStyleClamPizza;
import pizza.NY.NYStylePepperoniPizza;
import pizza.NY.NYStyleVeggiePizza;
import pizza_types.PizzaType;

public class NYPizzaFactory extends PizzaFactory {

    public Pizza createPizza(PizzaType type){

        Pizza pizza = null;
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals(PizzaType.CLAM)) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            pizza = new NYStyleVeggiePizza();
        }
        return pizza;
    }
}
