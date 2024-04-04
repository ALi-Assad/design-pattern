package base;

import coffee_size.Size;

public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;
    public abstract String getDescription();

    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
