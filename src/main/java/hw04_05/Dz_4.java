package hw04_05;

import hw04_05.Enum.DayOfWeek;
import hw04_05.Enum.Species;

import java.util.HashMap;
import java.util.Map;

public class Dz_4 {
    public static void main(String[] args) {
        Pet dog = new Pet(Species.DOG, "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});

        Human mother = new Human("Jane", "Karleone", 1950);
        Human father = new Human("Vito", "Karleone", 1945);
        Family family = new Family(mother, father);
        family.setPet(dog);

        Map<DayOfWeek, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.MONDAY, "Football");
        schedule.put(DayOfWeek.TUESDAY, "Chess");

        Human child = new Human("Michael", "Karleone", 1977, 90, schedule);
        family.addChild(child);

        child.greetPet();
        child.describePet();
        dog.eat();
        dog.respond();
        dog.foul();

        System.out.println(child);
        System.out.println(dog);
        System.out.println(family);

        // Эмуляция удаления
        dog.onDelete();
        child.onDelete();
        family.onDelete();

    }
}


