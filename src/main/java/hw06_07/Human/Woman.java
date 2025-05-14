package hw06_07.Human;

import hw06_07.Animal.Pet;
import hw06_07.Enum.DayOfWeek;

import java.util.Map;

public final class Woman extends Human {
    public Woman(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    @Override
    public void greetPet() {
        if (getFamily() != null && getFamily().getPets() != null && !getFamily().getPets().isEmpty()) {
            for (Pet pet : getFamily().getPets()) {
                System.out.printf("Hello, my dear %s! How can you handle it?\n", pet.getNickname());
            }
        } else {
            System.out.println("I don’t have pets to greet.");
        }
    }

    public void makeup() {
        System.out.println("Woman putting on makeup");
    }

    @Override
    public String toString() {
        return String.format("Women : name=%s, surname=%s, year=%d, iq=%d} ",
                getName(), getSurname(), getYear(), getIq());
    }
}


