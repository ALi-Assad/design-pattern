package pizza.NY;

import pizza.Pizza;

public class NYStyleVeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare NY style veggie");
    }

    @Override
    public void cut() {
        System.out.println("cut NY style veggie");
    }

    @Override
    public void bake() {
        System.out.println("bake NY style veggie");
    }

    @Override
    public void box() {
        System.out.println("box NY style veggie");
    }

}
