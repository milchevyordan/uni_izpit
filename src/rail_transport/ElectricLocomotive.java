package rail_transport;

public class ElectricLocomotive extends Locomotive {
    @Override
    public LocomotiveType getType() {
        return LocomotiveType.ELECTRIC;
    }

    @Override
    public double calculate(){
        return 7.0;
    }
}
