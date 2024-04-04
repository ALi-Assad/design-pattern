package pizza.Chicago;

import pizza.Pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare chicago style Veggie");
    }

    @Override
    public void cut() {
        System.out.println("cut chicago style Veggie");
    }

    @Override
    public void bake() {
        System.out.println("bake chicago style Veggie");
    }

    @Override
    public void box() {
        System.out.println("box chicago style Veggie");
    }
}
