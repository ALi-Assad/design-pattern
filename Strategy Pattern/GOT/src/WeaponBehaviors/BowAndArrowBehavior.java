package WeaponBehaviors;

import Base.WeaponBehavior;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrow 🏹");
    }
}
