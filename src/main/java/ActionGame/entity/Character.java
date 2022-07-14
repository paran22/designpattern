package ActionGame.entity;

import ActionGame.WeaponBehavior;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public void fight() {
        weaponBehavior.useWeapon();
    }
}
