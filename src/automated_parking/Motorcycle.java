package automated_parking;

public class Motorcycle extends Vehicle {
    @Override
    public String klaxon(){
        return "IkIk";
    }

    public Motorcycle(double width, double length, Engine engine) {
        super(width, length, engine);
    }
}
