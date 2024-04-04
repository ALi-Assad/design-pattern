//package factory;
//
//import pizza.*;
//import pizza.Chicago.ChicagoStyleCheesePizza;
//import pizza.Chicago.ChicagoStyleClamPizza;
//import pizza.Chicago.ChicagoStylePepperoniPizza;
//import pizza.Chicago.ChicagoStyleVeggiePizza;
//import pizza_types.PizzaType;
//
//public class ChicagoPizzaFactory extends PizzaFactory {
//
//    public Pizza createPizza(PizzaType type){
//
//        Pizza pizza = null;
//        if (type.equals(PizzaType.CHEESE)) {
//            pizza = new ChicagoStyleCheesePizza();
//        } else if (type.equals(PizzaType.PEPPERONI)) {
//            pizza = new ChicagoStylePepperoniPizza();
//        } else if (type.equals(PizzaType.CLAM)) {
//            pizza = new ChicagoStyleClamPizza();
//        } else if (type.equals(PizzaType.VEGGIE)) {
//            pizza = new ChicagoStyleVeggiePizza();
//        }
//        return pizza;
//    }
//}
