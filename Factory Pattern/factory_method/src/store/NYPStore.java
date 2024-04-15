package store;

import factory.NYPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import pizza.*;
import pizza_types.PizzaType;

public class NYPStore extends PizzaStore  {

    @Override
    public Pizza createPizza(PizzaType type){

        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        Pizza pizza = null;
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals(PizzaType.VEGGIE)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals(PizzaType.CLAM)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
