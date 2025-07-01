package rail_transport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StationMap {
    private static final Map<Station, List<Station>> stations = new HashMap<>();

    public static void addStation(Station station) {
        stations.putIfAbsent(station, new ArrayList<>());
    }

    public static String addEdge(Station startStation, Station endStation) {
        addStation(startStation);
        addStation(endStation);

        stations.get(startStation).add(endStation);
        stations.get(endStation).add(startStation);

        return "Edge added between " + startStation + " and " + endStation;
    }

    public static List<Station> getRoute(Station station) {
        return stations.get(station);
    }
}
