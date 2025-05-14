package hw06_07;

import hw06_07.Animal.Pet;
import hw06_07.Enum.DayOfWeek;
import hw06_07.Enum.Species;
import hw06_07.Human.Family;
import hw06_07.Human.Human;
import hw06_07.Human.Man;
import hw06_07.Human.Woman;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class Dz_6_7 {
    public static void main(String[] args) {
        Map<DayOfWeek, String> schedule = new EnumMap<>(DayOfWeek.class);
        schedule.put(DayOfWeek.MONDAY, "Read books");

        Woman mother = new Woman("Anna", "Smith", 1980, 120, schedule);
        Man father = new Man("John", "Smith", 1978, 105, schedule);
        Family family = new Family(mother, father);

        Pet dog = new Pet("Rex", 5, 70, Set.of("barking", "playing")) {
            @Override
            protected Species detectSpecies() {
                return Species.DOG;
            }

            @Override
            public void respond() {
                System.out.println("Woof! I am " + getNickname());
            }
        };

        Pet cat = new Pet("Murka", 3, 40, Set.of("sleeping")) {
            @Override
            protected Species detectSpecies() {
                return Species.CAT;
            }

            @Override
            public void respond() {
                System.out.println("Meow! I am " + getNickname());
            }
        };

        family.addPet(dog);
        family.addPet(cat);

        mother.greetPet();
        mother.describePet();
        father.greetPet();
        father.describePet();

        Human child = family.bornChild();
        Human child2 = family.bornChild();
        System.out.println("Newborn child: " + child);
        System.out.println();
        System.out.println("Newborn child: " + child2);
        System.out.println("Before delete: " + family.getChildren());
        family.deleteChild(0);
        System.out.println("After delete: " + family.getChildren());
        System.out.println("Family members count: " + family.countFamily());
    }
}



