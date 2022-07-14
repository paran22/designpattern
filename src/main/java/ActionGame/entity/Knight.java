package ActionGame.entity;

import ActionGame.SwordBehavior;

public class Knight extends Character {

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}
