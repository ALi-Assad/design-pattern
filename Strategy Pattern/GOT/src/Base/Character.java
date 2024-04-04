package Base;

public abstract class Character {

    protected WeaponBehavior weapon;
    protected int battle;
    public Character() {}

    public abstract void fight();

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
