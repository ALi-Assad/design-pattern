package pizza.Chicago;

import pizza.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare chicago style pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("cut chicago style pepperoni");
    }

    @Override
    public void bake() {
        System.out.println("bake chicago style pepperoni");
    }

    @Override
    public void box() {
        System.out.println("box chicago style pepperoni");
    }
}
