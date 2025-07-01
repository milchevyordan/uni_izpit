package rail_transport;

public class SteamLocomotive extends Locomotive {
    @Override
    public LocomotiveType getType() {
        return LocomotiveType.STEAM;
    }

    @Override
    public double calculate(){
        return 9.6;
    }
}
