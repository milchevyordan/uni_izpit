package farm;

public class Horse extends Animal implements Freight {
    public Horse(int maxPower) {
        super(maxPower);
    }

    public String neigh(){
        return "Цвилене";
    }

    @Override
    public void eat(){
        if (getPower() < getMaxPower()) {
            setPower(getPower() + (int)(getPower()*0.05));
        }
    }

    @Override
    public void work(){
        setPower(getPower()/2);
    }
}
