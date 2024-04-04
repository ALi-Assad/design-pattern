package Behaviors.quack;

import Base.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack()
    {
        System.out.println("<< Silence >>");
    }
}
