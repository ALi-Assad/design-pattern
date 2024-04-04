package pizza.NY;

import pizza.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare NY style Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("cut NY style Pepperoni");
    }

    @Override
    public void bake() {
        System.out.println("bake NY style Pepperoni");
    }

    @Override
    public void box() {
        System.out.println("box NY style Pepperoni");
    }
}
