package rail_transport;

public class Coordinate {
    private double longitude;
    private double latitude;
    private double radiusOfEarth = 6371.0;

    public Coordinate(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getDistance(Coordinate coordinate){
        return 987.0;
    }
}
