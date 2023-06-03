package OOP_practicalTasks.PT02.base;

import OOP_practicalTasks.PT02.SpeedFly;

public class Bee extends Arthropod implements SpeedFly {

    public Bee(String animalName) {
        super(animalName);
    }

    @Override
    public String lifeExpectancy() {
        return "Суша";
    }

    @Override
    public String methodTransportation() {
        return "Летание";
    }

    @Override
    public String toString() {
        return String.format("Пчела: %s, Скорость перемещения: %d", super.toString(), getFlySpeed());
    }

    @Override
    public Integer getFlySpeed() {
        return 20;
    }
    
}
