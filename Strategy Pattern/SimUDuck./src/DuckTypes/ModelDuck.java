package DuckTypes;

import Base.Duck;
import Behaviors.fly.FlyNoWay;
import Behaviors.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
       System.out.println("I'm a Model duck");
    }

}
