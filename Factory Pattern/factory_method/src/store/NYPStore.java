package store;

import pizza.Chicago.ChicagoStyleCheesePizza;
import pizza.Chicago.ChicagoStyleClamPizza;
import pizza.Chicago.ChicagoStylePepperoniPizza;
import pizza.Chicago.ChicagoStyleVeggiePizza;
import pizza.NY.NYStyleCheesePizza;
import pizza.NY.NYStyleClamPizza;
import pizza.NY.NYStylePepperoniPizza;
import pizza.NY.NYStyleVeggiePizza;
import pizza.Pizza;
import pizza_types.PizzaType;

public class NYPStore extends PizzaStore  {

    @Override
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
