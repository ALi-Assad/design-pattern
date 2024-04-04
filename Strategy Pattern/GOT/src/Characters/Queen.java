package Characters;

import Base.Character;
import WeaponBehaviors.BowAndArrowBehavior;

public class Queen extends Character {

    public Queen() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Fight as Queen 👑");
        weapon.useWeapon();
    }
}
