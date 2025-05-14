package hw06_07.Animal;

import hw06_07.Enum.Species;
import hw06_07.Interface.Foulable;

import java.util.Set;

class DomesticCat extends Pet implements Foulable {
    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    protected Species detectSpecies() { return Species.CAT; }
    @Override
    public void respond() {
        System.out.println("Мяу! Я кіт " + getNickname());
    }
    @Override
    public void foul() {
        System.out.println("Кіт розбив вазу та вдав, що це не він.");
    }
}