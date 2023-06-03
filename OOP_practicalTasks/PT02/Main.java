package OOP_practicalTasks.PT02;

import OOP_practicalTasks.PT02.base.Animal;
import OOP_practicalTasks.PT02.base.Bee;
import OOP_practicalTasks.PT02.base.Crocodile;
import OOP_practicalTasks.PT02.base.Frog;
import OOP_practicalTasks.PT02.base.Salamander;
import OOP_practicalTasks.PT02.base.Snake;
import OOP_practicalTasks.PT02.terrarium.Terrarium;

public class Main {
    public static void main(String[] args) {
        Animal snake = new Snake("Полоз");
        Animal crocodile = new Crocodile("Аллигатор");

        Terrarium terrarium = new Terrarium();
        terrarium.addAnimal(snake).addAnimal(crocodile)
            .addAnimal(new Frog("Остромордая лягушка"))
            .addAnimal(new Salamander("Саламандра"))
            .addAnimal(new Bee("Пчела"));
        System.out.println(terrarium);

        System.out.println("----------------");

        SpeedSwimm champSwimm = (SpeedSwimm) terrarium.getSwimmerChampion();
        System.out.println("Быстрее всех в террариуме плавает: ");
        System.out.println(champSwimm);

        System.out.println("----------------");

        SpeedFly champFly = (SpeedFly) terrarium.getFlyerChampion();
        System.out.println("Быстрее всех в террариуме летает: ");
        System.out.println(champFly);
    }
}
