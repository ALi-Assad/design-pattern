package Behaviors.fly;

import Base.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly()
    {
        System.out.println("I can't fly");
    }
}
