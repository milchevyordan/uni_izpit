package automated_parking;

public class Place extends Premises{
    private Vehicle vehicle;

    public Vehicle getVehicle(){
        return vehicle;
    }

    public Place(double width, double length){
        super(width, length);
    }

    public void release(){
        vehicle = null;
    }

    public boolean isFree(){
        return vehicle == null;
    }

    public Vehicle setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        return vehicle;
    }
}
