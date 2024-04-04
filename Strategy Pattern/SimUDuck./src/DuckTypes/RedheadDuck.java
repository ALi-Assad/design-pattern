package DuckTypes;

import Base.Duck;
import Base.QuackBehavior;
import Behaviors.fly.FlyWithWings;
import Behaviors.quack.Quack;

public class RedheadDuck extends Duck {


    public RedheadDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display()
    {
        System.out.println("I'm a Redhead Duck");
    }
}
