package hw06_07.Human;

import hw06_07.Animal.Pet;
import hw06_07.Enum.DayOfWeek;

import java.util.Map;
import java.util.Objects;

public abstract class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<DayOfWeek, String> schedule;
    private Family family;

    public Human(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public abstract void greetPet();

    public void describePet() {
        if (family != null && family.getPets() != null && !family.getPets().isEmpty()) {
            for (Pet pet : family.getPets()) {
                String cleverness = pet.getTrickLevel() > 50 ? "very cunning" : "almost not cunning";
                System.out.printf("I have %s, her %d years, he %s.\n", pet.getSpecies(), pet.getAge(), cleverness);
            }
        } else {
            System.out.println("I don’t have pets to describe.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq, schedule, family);
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getYear() { return year; }
    public int getIq() { return iq; }
    public Family getFamily() { return family; }
    public void setFamily(Family family) { this.family = family; }
}