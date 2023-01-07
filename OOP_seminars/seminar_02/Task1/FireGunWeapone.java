package OOP_seminars.seminar_02.Task1;

public class FireGunWeapone extends Weapon {

    @Override
    public float getDamage() {
        return 75.0f;
    }

    @Override
    public String getName() {
        return "Fire Gun";
    }

    @Override
    public int getNumberChargesInClip() {
        
        return 1;
    }

    @Override
    public float getRateFire() {
       
        return 6.0f;
    }

    @Override
    public String getSoundWhenShot() {
        
        return "Puff";
    }

    @Override
    public String toString() {
        return "FireGunWeapone []";
    }

}
