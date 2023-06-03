package OOP_practicalTasks.PT02.base;

public abstract class Arthropod extends Animal {

    public Arthropod(String animalName) {
        super(animalName);
    }

    @Override
    public String reproduction() {
        return "Откладывание яиц";
    }
}
