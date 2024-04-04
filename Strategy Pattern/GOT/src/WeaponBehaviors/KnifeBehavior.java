package WeaponBehaviors;

import Base.WeaponBehavior;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Knife 🗡");
    }
}
