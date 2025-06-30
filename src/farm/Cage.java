package farm;

public class Cage extends Building {
    private Animal animal;

    public Cage(double height, double width, double length) {
        super(height, width, length);
    }

    private boolean validateAccommodation(Animal animal) {
        Dimension animalDim = animal.getDimension();

        return animalDim.getHeight() <= getHeight() &&
                animalDim.getWidth()  <= getWidth() &&
                animalDim.getLength() <= getLength();
    }

    public boolean Accommodation(Animal animal) {
        if (this.animal == null && validateAccommodation(animal)) {
            this.animal = animal;
            return true;
        }
        return false;
    }

    public boolean release() {
        if (this.animal != null) {
            this.animal = null;
            return true;
        }
        return false;
    }

    public Animal getAnimal() {
        return this.animal;
    }
}
