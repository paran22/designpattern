package duck;

import duck.entity.Duck;
import duck.entity.MallardDuck;
import duck.entity.RedHeadDuck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        System.out.println("---------changeFlyBehavior------------");
        duck.setFly(new FlyNoWay());
        duck.performFly();

        Duck duck2 = new RedHeadDuck();
        duck2.display();
        duck2.swim();
    }
}
