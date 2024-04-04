package Characters;

import Base.Character;
import WeaponBehaviors.SwordBehavior;

public class King extends Character {

    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Fight as King 👑");
        weapon.useWeapon();
    }
}
