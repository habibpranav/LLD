public class Ticket {

    private final String id;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private int minutes;

    public Ticket(String id, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.id = id;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.minutes = 0;
    }

    public String getId() {
        return id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public int getMinutes() {
        return minutes;
    }
}