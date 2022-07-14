package duck.entity;

import duck.FlyBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    public void swim() {
        System.out.println("I'm swimming!!!");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void setFly(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

}
