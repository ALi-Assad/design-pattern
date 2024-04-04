package pizza.NY;

import pizza.Pizza;

public class NYStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare NY style clam");
    }

    @Override
    public void cut() {
        System.out.println("cut NY style clam");
    }

    @Override
    public void bake() {
        System.out.println("bake NY style clam");
    }

    @Override
    public void box() {
        System.out.println("box NY style clam");
    }{

    }
}
