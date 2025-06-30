package automated_parking;

public class Truck extends Vehicle {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String klaxon(){
        return "UuuUuu";
    }

    public Truck(double width, double length, Engine engine, int capacity) {
        super(width, length, engine);
        this.capacity = capacity;
    }
}
