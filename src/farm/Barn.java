package farm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Barn extends Building {
    private Set<Cage> cages;

    public Barn(double height, double width, double length, int cageCount) {
        super(height, width, length);
    }

    public boolean addAnimal(Animal animal) {
        return false;
    }

    public boolean removeAnimal() {
        return false;
    }

    public boolean checkCapacity() {
        for (Cage cage : cages) {
            if (cage.getAnimal() == null) return true;
        }
        return false;
    }

    public Set<Cage> getCages() {
        return cages;
    }

    public Animal[] getAnimals() {
        List<Animal> animals = new ArrayList<>();
        for (Cage cage : cages) {
            if (cage.getAnimal() != null) {
                animals.add(cage.getAnimal());
            }
        }
        return animals.toArray(new Animal[0]);
    }

    public boolean removeAll() {
        for (Cage cage : cages) {
            cage.release();
        }

        return true;
    }
}
