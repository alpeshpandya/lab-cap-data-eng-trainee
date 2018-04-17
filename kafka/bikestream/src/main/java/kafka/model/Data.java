package kafka.model;

import java.util.List;

public class Data {
    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public List<Station> getStations() {

        return stations;
    }

    private List<Station> stations;
}
