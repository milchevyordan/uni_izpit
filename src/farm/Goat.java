package farm;

public class Goat extends Milking {
    public Goat(int maxPower, double maxQuantity) {
        super(maxPower, maxQuantity);
    }

    public String bleat() {
        return "Блеене";
    }

    @Override
    public void eat() {
        if (getPower() < getMaxPower()) {
            setPower(getPower() + (int)(getPower()*0.05));
        }

        if (getQuantity() < getMaxQuantity()) {
            setQuantity(getQuantity() + (int)(getQuantity()*0.05));
        }
    }
}
