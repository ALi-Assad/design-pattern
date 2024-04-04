package Characters;

import Base.Character;
import WeaponBehaviors.AxeBehavior;

public class Knight extends Character {

    public Knight() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Fight as Knight 🛡");
        weapon.useWeapon();
    }
}
