package hw06_07.Animal;

import hw06_07.Enum.Species;
import hw06_07.Interface.Foulable;

import java.util.Set;

public class RoboCat extends Pet implements Foulable {

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    @Override
    protected Species detectSpecies() {
        return Species.ROBOCAT;
    }
    @Override
    public void respond() {
        System.out.println("I am a robot cat " + getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Robokit spilled grease ");
    }
}
