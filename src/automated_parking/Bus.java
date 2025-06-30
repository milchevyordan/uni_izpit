package automated_parking;

public class Bus extends Vehicle {
    private int places;

    public int getPlaces() {
        return places;
    }

    @Override
    public String klaxon() {
        return "WeeWee";
    }

    public Bus(double width, double length, Engine engine, int places) {
        super(width, length, engine);
        this.places = places;
    }
}
