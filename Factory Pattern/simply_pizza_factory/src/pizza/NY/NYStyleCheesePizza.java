package pizza.NY;

import pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare NY style cheese");
    }

    @Override
    public void cut() {
        System.out.println("cut NY style cheese");
    }

    @Override
    public void bake() {
        System.out.println("bake NY style cheese");
    }

    @Override
    public void box() {
        System.out.println("box NY style cheese");
    }

}
