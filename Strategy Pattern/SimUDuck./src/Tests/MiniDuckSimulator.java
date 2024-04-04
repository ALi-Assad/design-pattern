package Tests;

import Base.Duck;
import Behaviors.fly.FlyNoWay;
import Behaviors.fly.FlyRocketPowered;
import DuckTypes.MallardDuck;
import DuckTypes.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();

        System.out.println("------------");

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
