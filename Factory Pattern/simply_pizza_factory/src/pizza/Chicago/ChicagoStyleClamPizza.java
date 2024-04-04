package pizza.Chicago;

import pizza.Pizza;

public class ChicagoStyleClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare chicago style clam");
    }

    @Override
    public void cut() {
        System.out.println("cut chicago style clam");
    }

    @Override
    public void bake() {
        System.out.println("bake chicago style clam");
    }

    @Override
    public void box() {
        System.out.println("box chicago style clam");
    }
}
