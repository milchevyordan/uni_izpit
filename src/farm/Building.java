package farm;

public class Building implements Volume<Double> {
    private Dimension dimension;

    public Building(double height, double width, double length) {
        this.dimension = new Dimension(height, width, length);
    }

    public double getHeight() {
        return dimension.getHeight();
    }

    public double getWidth() {
        return dimension.getWidth();
    }

    public double getLength() {
        return dimension.getLength();
    }

    @Override
    public Double calculate() {
        return getHeight() * getWidth() * getLength();
    }
}
