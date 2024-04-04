package DuckTypes;

import Base.Duck;
import Behaviors.fly.FlyNoWay;
import Behaviors.quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
       System.out.println("I'm a RubberDuck");
    }
}
