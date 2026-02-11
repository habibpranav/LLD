public class ParkingSpot {

   private final SpotType type;
   private boolean isOccupied;
   private final int spotID;


    public ParkingSpot(SpotType type, int spotID) {
        this.type = type;
        this.spotID = spotID;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public int getSpotID() {
        return spotID;
    }

    public SpotType getType() {
        return type;
    }
}
