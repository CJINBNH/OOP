package OOP_practicalTasks.PT02.base;

import OOP_practicalTasks.PT02.SpeedSwimm;

public class Snake extends Reptile implements SpeedSwimm {

    public Snake(String animalName) {
        super(animalName);
    }

    @Override
    public String lifeExpectancy() {
        return "В основном суша";
    }

    @Override
    public String methodTransportation() {
        return "Ползание, скольжение, плавание";
    }
    
    @Override
    public String toString() {
        return String.format("Змея: %s, Скорость перемещения: %d", super.toString(), getSwimmingSpeed());
    }

    @Override
    public Integer getSwimmingSpeed() {
        return 10;
    }
}
