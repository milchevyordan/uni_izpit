package automated_parking;

public class Car extends Vehicle {
    private int doors;

    @Override
    public String klaxon() {
        return "Beep";
    }

    public int getDoors() {
        return doors;
    }

    public Car(double width, double length, Engine engine, int doors) {
        super(width, length, engine);
        this.doors = doors;
    }
}
