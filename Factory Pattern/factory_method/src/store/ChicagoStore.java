package store;

import factory.ChicagoPizzaIngredientFactory;
import factory.PizzaIngredientFactory;
import pizza.CheesePizza;
import pizza.PepperoniPizza;
import pizza.Pizza;
import pizza.VeggiePizza;
import pizza_types.PizzaType;

public class ChicagoStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {

        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        Pizza pizza = null;
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New chicago Cheese Pizza");
        } else if (type.equals(PizzaType.PEPPERONI)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New chicago Veggie Pizza");
        } else if (type.equals(PizzaType.CLAM)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New chicago Clam Pizza");
        } else if (type.equals(PizzaType.VEGGIE)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New chicago Pepperoni Pizza");
        }
        return pizza;
    }
}
