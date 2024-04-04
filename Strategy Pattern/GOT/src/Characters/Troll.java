package Characters;

import Base.Character;
import WeaponBehaviors.KnifeBehavior;

public class Troll extends Character {

    public Troll() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Fight as Troll ⛈");
        weapon.useWeapon();
    }
}
