package tests;

import Base.Character;
import Characters.Queen;
import WeaponBehaviors.AxeBehavior;

public class Battle {

    public static void main(String[] args)
    {
        Character queen = new Queen();
        queen.fight();
        queen.setWeapon(new AxeBehavior());
        queen.fight();

    }
}
