package farm;

public class Dimension {
    private double height;
    private double width;
    private double length;

    public Dimension(double height, double width, double length){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    protected double getHeight(){
        return this.height;
    }

    protected double getWidth(){
        return this.width;
    }

    protected double getLength(){
        return this.length;
    }

}
