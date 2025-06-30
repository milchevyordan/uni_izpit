package farm;

public class Cattle extends Milking implements Freight{
    public Cattle(int maxPower, double maxQuantity) {
        super(maxPower, maxQuantity);
    }

    public String moo() {
        return "Мучене";
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

    @Override
    public void work(){
        setPower(getPower()/2);
    }
}
