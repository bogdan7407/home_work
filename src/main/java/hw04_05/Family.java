package hw04_05;

import java.util.ArrayList;
import java.util.List;

class Family {
    private final Human mother;
    private final Human father;
    private final List<Human> children;
    private Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
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

    public void onDelete() {
        System.out.printf("[FAMILY] Deleting family of %s and %s\n", mother.getName(), father.getName());
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }

    // Getters and Setters
    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
