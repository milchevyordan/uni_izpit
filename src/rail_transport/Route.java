package rail_transport;

import java.util.ArrayList;
import java.util.List;

public class Route {
    private List<Station> stations;
    private Station currentStation;
    private int nextStationIndex;

    public Route(Station startStation){
        stations = new ArrayList<>();
        stations.add(startStation);
    }

    public Station getNextStation(){
        return stations.get(nextStationIndex);
    }

    public Station getCurrentStation(){
        return currentStation;
    }

    public boolean hasNextStation(){
        return nextStationIndex < stations.size();
    }
}
