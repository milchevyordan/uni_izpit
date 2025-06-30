package farm;

public abstract class Animal implements Volume<Double>{
    private int power;
    private int maxPower;
    private Dimension dimension;

    public Animal(int maxPower) {
        this.maxPower = maxPower;
        this.power = 0;
        this.dimension = new Dimension(0, 0, 0);
    }

    public abstract void eat();

    public boolean fed(){
        return power >= maxPower;
    }

    public Dimension getDimension() {
        return dimension;
    }

    protected void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public int getMaxPower() {
        return maxPower;
    }

    @Override
    public Double calculate() {
        return 0.0;
    }
}
