package Base;

public abstract class Duck {

    public Duck(){}

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void performQuack()
    {
        quackBehavior.quack();
    }

    public void performFly()
    {
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb)
    {
       quackBehavior = qb;
    }
}
