package condiments;

import base.Beverage;
import base.CondimentDecorator;
import coffee_size.Size;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy" ;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
              cost += .10;
        }
        if(beverage.getSize() == Size.GRAND){
             cost += .15;
        }
        if(beverage.getSize() == Size.VENTI){
             cost += .20;
        }
        return cost;
    }
}
