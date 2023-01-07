package OOP_seminars.seminar_02.Task1;

public class GunWeapon extends Weapon {

    @Override
    public String getName() {
        return "Eagle";
    }

    @Override
    public float getDamage() {
        return 30.0f;
    }

    @Override
    public float getRateFire() {
        return 20.0f;
    }

    @Override
    public int getNumberChargesInClip() {
        return 8;
    }

    @Override
    public String getSoundWhenShot() {
        return "Bang";
    }

    @Override
    public String toString() {
        return "GunWeapon []";
    }
    
}
