package OOP_practicalTasks.PT02.terrarium;

import java.util.ArrayList;
import java.util.List;

import OOP_practicalTasks.PT02.SpeedFly;
import OOP_practicalTasks.PT02.SpeedSwimm;
import OOP_practicalTasks.PT02.base.Animal;

public class Terrarium {
    private List<Animal> terrarium = new ArrayList<>();

    public Terrarium addAnimal(Animal someAnimal){
        terrarium.add(someAnimal);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("В террариуме: \n");
        for (Animal animal : terrarium) {
            builder.append(animal).append('\n');
        }
        return builder.toString();
    }

    private List<SpeedSwimm> swimmers() {
        List<SpeedSwimm> swimmers = new ArrayList();
        for (Animal animal : terrarium) {
            if (animal instanceof SpeedSwimm) {
                swimmers.add((SpeedSwimm)animal);
            }
        }
        return swimmers;
    }

    public SpeedSwimm getSwimmerChampion() {
        List<SpeedSwimm> swimmers = swimmers();
        SpeedSwimm champSwimm = swimmers.get(0);
        for (SpeedSwimm swimmer : swimmers) {
            if (champSwimm.getSwimmingSpeed() < swimmer.getSwimmingSpeed()) {
                champSwimm = swimmer;
            }
        }
        return champSwimm;
    }

    private List<SpeedFly> flyers() {
        List<SpeedFly> flyers = new ArrayList<>();
        for (Animal animal : terrarium) {
            if (animal instanceof SpeedFly) {
                flyers.add((SpeedFly)animal);
            }
        }
        return flyers;
    }

    public SpeedFly getFlyerChampion() {
        List<SpeedFly> flyers = flyers();
        SpeedFly champFly = flyers.get(0);
        for (SpeedFly flyer : flyers) {
            if (champFly.getFlySpeed() < flyer.getFlySpeed()) {
                champFly = flyer;
            }
        }
        return champFly;
    }
}
