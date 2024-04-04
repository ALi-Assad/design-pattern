package DuckTypes;

import Base.Duck;
import Behaviors.fly.FlyWithWings;
import Behaviors.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck()
    {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();

    }
    @Override
    public void display()
    {
       System.out.println("I'm a DecoyDuck");
    }
}
