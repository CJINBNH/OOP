package OOP_practicalTasks.PT02.base;

import OOP_practicalTasks.PT02.SpeedSwimm;

public class Salamander extends Amphibian implements SpeedSwimm {

    public Salamander(String animalName) {
        super(animalName);
    }

    @Override
    public String lifeExpectancy() {
        return "Вода, суша";
    }

    @Override
    public String methodTransportation() {
        return "Ползание, плавание";
    }

    @Override
    public String toString() {
        return String.format("Саламандра: %s, Скорость перемещения: %d", super.toString(), getSwimmingSpeed());
    }

    @Override
    public Integer getSwimmingSpeed() {
        return 7;
    }
    
}
