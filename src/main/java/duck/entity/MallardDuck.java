package duck.entity;

import duck.FlyWithWings;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("청둥오리!!");
    }
}
