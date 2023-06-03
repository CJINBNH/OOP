package OOP_practicalTasks.PT02.base;

import OOP_practicalTasks.PT02.SpeedSwimm;

public class Crocodile extends Reptile implements SpeedSwimm {

    public Crocodile(String animalName) {
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
        return String.format("Крокодил: %s, Скорость перемещения: %d", super.toString(), getSwimmingSpeed());
    }

    @Override
    public Integer getSwimmingSpeed() {
        return 15;
    }
    
}
