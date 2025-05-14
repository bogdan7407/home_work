package hw06_07.Animal;

import hw06_07.Enum.Species;
import hw06_07.Interface.Foulable;

import java.util.Set;

class Dog extends Pet implements Foulable {

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    protected Species detectSpecies() { return Species.DOG; }
    @Override
    public void respond() {
        System.out.println("Гав! Я пес " + getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Пес наробив шкоди.");
    }
}

