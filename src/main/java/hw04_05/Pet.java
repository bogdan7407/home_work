package hw04_05;

import hw04_05.Enum.Species;

import java.util.Arrays;
import java.util.Objects;

class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet() {
    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("Я їм!");
    }

    public void respond() {
        System.out.printf("Привіт, хазяїн. Я - %s. Я скучив!\n", nickname);
    }

    public void foul() {
        System.out.println("Потрібно добре замести сліди...");
    }

    public void onDelete() {
        System.out.printf("[PET] Deleting: %s\n", this);
    }

    @Override
    public String toString() {
        return String.format("%s{nickname='%s', age=%d, trickLevel=%d, habits=%s}", species, nickname, age, trickLevel, Arrays.toString(habits));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel);
    }

    // Getters and Setters
    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }
}
