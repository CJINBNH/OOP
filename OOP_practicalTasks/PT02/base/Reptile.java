package OOP_practicalTasks.PT02.base;

public abstract class Reptile extends Animal {

    public Reptile(String animalName) {
        super(animalName);
    }

    @Override
    public String reproduction() {
        return "Откладывание яиц";
    }
}
