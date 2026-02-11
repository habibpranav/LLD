import java.util.List;
import java.util.Map;

public class Floor {



    private final String floorNumber;
    /*
    Disabled  - D-10
    Regular - R11
     */
    private final Map<SpotType, List<ParkingSpot>> spots;

    public Floor(String floorNumber, Map<SpotType, List<ParkingSpot>> spots) {
        this.floorNumber = floorNumber;
        this.spots = spots;
    }

    public Map<SpotType, List<ParkingSpot>> getSpots() {
        return spots;
    }

    public String getFloorNumber() {
        return floorNumber;
    }
}
