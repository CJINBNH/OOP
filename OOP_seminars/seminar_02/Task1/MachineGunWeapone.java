package OOP_seminars.seminar_02.Task1;

public class MachineGunWeapone extends Weapon {

    @Override
    public String getName() {
        return "АК-74";
    }

    @Override
    public float getDamage() {
        return 50.0f;
    }

    @Override
    public float getRateFire() {
        return 150.0f;
    }

    @Override
    public int getNumberChargesInClip() {
        return 30;
    }

    @Override
    public String getSoundWhenShot() {
        return "bra-ta-ta-ta-ta";
    }

    @Override
    public String toString() {
        return "MachineGunWeapone []";
    }
    
}
