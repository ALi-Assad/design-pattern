package store;

import pizza.Chicago.ChicagoStyleCheesePizza;
import pizza.Chicago.ChicagoStyleClamPizza;
import pizza.Chicago.ChicagoStylePepperoniPizza;
import pizza.Chicago.ChicagoStyleVeggiePizza;
import pizza.Pizza;
import pizza_types.PizzaType;

public class ChicagoStore extends PizzaStore  {

    @Override
    public Pizza createPizza(PizzaType type){

        Pizza pizza = null;
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals(PizzaType.CLAM)) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
