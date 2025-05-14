package hw06_07.Animal;

import hw06_07.Enum.Species;

import java.util.Set;

class Fish extends Pet {

    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    protected Species detectSpecies() { return Species.FISH; }
    @Override
    public void respond() {
        System.out.println("... рибка мовчить ...");
    }
}