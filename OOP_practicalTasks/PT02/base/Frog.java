package OOP_practicalTasks.PT02.base;

import OOP_practicalTasks.PT02.SpeedSwimm;

public class Frog extends Amphibian implements SpeedSwimm   {

    public Frog(String animalName) {
        super(animalName);
    }

    @Override
    public String lifeExpectancy() {
        return "Суша, вода";
    }

    @Override
    public String methodTransportation() {
        return "Прыгание, плавание";
    }

    @Override
    public String toString() {
        return String.format("Лягушка: %s, Скорость перемещения: %d", super.toString(), getSwimmingSpeed());
    }

    @Override
    public Integer getSwimmingSpeed() {
        return 3;
    }
    
}
