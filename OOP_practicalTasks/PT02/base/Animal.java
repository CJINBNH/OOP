package OOP_practicalTasks.PT02.base;

public abstract class Animal {
    protected String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public abstract String reproduction();

    public abstract String lifeExpectancy();

    public abstract String methodTransportation();

    // public abstract Integer swimmingSpeed();

    @Override
    public String toString() {
        return String.format("Животное: %s, Среда обитания: %s, Способ размножения: %s, Способ перемещения: %s", animalName, lifeExpectancy(), reproduction(), methodTransportation());
    }
}
