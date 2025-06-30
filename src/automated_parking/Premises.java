package automated_parking;

public class Premises implements Volume {
    private Dimensions dimension;

    public Premises(double width, double length) {
        this.dimension = new Dimensions(width, length);
    }

    public double getWidth() {
        return dimension.getWidth();
    }

    public double getLength() {
        return dimension.getLength();
    }

    @Override
    public double calculate() {
        return dimension.getWidth() * dimension.getLength();
    }
}
