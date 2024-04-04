package pizza.Chicago;

import pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare chicago style cheese");
    }

    @Override
    public void cut() {
        System.out.println("cut chicago style cheese");
    }

    @Override
    public void bake() {
        System.out.println("bake chicago style cheese");
    }

    @Override
    public void box() {
        System.out.println("box chicago style cheese");
    }
}
