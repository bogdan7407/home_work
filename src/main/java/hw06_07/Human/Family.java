package hw06_07.Human;


import hw06_07.Animal.Pet;
import hw06_07.Enum.DayOfWeek;
import hw06_07.Interface.HumanCreator;

import java.util.*;

public class Family implements HumanCreator {
    private final Human mother;
    private final Human father;
    private final List<Human> children;
    private final Set<Pet> pets;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.pets = new HashSet<>();
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public void addChild(Human child) {
        child.setFamily(this);
        children.add(child);
    }

    public boolean deleteChild(int index) {
        if (index >= 0 && index < children.size()) {
            children.remove(index);
            return true;
        }
        return false;
    }

    public boolean deleteChild(Human child) {
        return children.remove(child);
    }

    public int countFamily() {
        return 2 + children.size();
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    @Override
    public Human bornChild() {
        Random random = new Random();
        String[] boyNames = {"Bob", "Bogdan", "Anton", "Den"};
        String[] girlNames = {"Olena", "Sofia", "Elena", "Kateryna"};
        boolean isBoy = random.nextBoolean();
        String name = isBoy ? boyNames[random.nextInt(boyNames.length)]
                : girlNames[random.nextInt(girlNames.length)];
        int year = Calendar.getInstance().get(Calendar.YEAR);
        String surname = father.getSurname();
        int iq = (father.getIq() + mother.getIq()) / 2;
        Map<DayOfWeek, String> schedule = new EnumMap<>(DayOfWeek.class);
        schedule.put(DayOfWeek.MONDAY, "Swimming");
        schedule.put(DayOfWeek.FRIDAY, "Dancing");

        Human child = isBoy ? new Man(name, surname, year, iq, schedule)
                : new Woman(name, surname, year, iq, schedule);

        child.setFamily(this);
        children.add(child);
        return child;
    }

    public Human getMother() { return mother; }
    public Human getFather() { return father; }
    public List<Human> getChildren() { return children; }
    public Set<Pet> getPets() { return pets; }
}

