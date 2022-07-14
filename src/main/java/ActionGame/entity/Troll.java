package ActionGame.entity;

import ActionGame.AxeBehavior;
import ActionGame.SwordBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}
