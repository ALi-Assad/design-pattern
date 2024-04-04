package WeaponBehaviors;

import Base.WeaponBehavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Sword ⚔");
    }
}
