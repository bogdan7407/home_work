package hw06_07.Animal;

import hw06_07.Enum.Species;
import java.util.Set;


public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;
    private final Species species;

    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.species = detectSpecies();
    }

    protected abstract Species detectSpecies();

    public void eat() {
        System.out.println("I am eating!");
    }

    public abstract void respond();

    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}",
                species.name().toLowerCase(), nickname, age, trickLevel, habits);
    }

    public String getNickname() { return nickname; }
    public int getAge() { return age; }
    public int getTrickLevel() { return trickLevel; }
    public Set<String> getHabits() { return habits; }
    public Species getSpecies() { return species; }
}