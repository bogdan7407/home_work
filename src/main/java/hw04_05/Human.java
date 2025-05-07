package hw04_05;

import hw04_05.Enum.DayOfWeek;

import java.util.Map;
import java.util.Objects;

class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Map<DayOfWeek, String> schedule;
    private Family family;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public void greetPet() {
        if (family != null && family.getPet() != null) {
            System.out.printf("Привіт, %s\n", family.getPet().getNickname());
        }
    }

    public void describePet() {
        if (family != null && family.getPet() != null) {
            Pet pet = family.getPet();
            String cleverness = pet.getTrickLevel() > 50 ? "дуже хитрий" : "майже не хитрий";
            System.out.printf("У мене є %s, їй %d років, він %s.\n", pet.getSpecies(), pet.getAge(), cleverness);
        }
    }

    public void onDelete() {
        System.out.printf("[HUMAN] Deleting: %s %s (%d)\n", name, surname, year);
    }

    @Override
    public String toString() {
        return String.format("Human{name='%s', surname='%s', year=%d, iq=%d, schedule=%s}",
                name, surname, year, iq, schedule);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setSchedule(Map<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}