package OOP_practicalTasks.PT02.base;

public abstract class Amphibian extends Animal {

    public Amphibian(String animalName) {
        super(animalName);
    }

    @Override
    public String reproduction() {
        return "Метание икры";
    }
}
