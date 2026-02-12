public class ParkingResult {

    private final ParkingStatus status;
    private final Ticket ticket;

    public ParkingResult(ParkingStatus status, Ticket ticket) {
        this.status = status;
        this.ticket = ticket;
    }

    public ParkingStatus getStatus() {
        return status;
    }

    public Ticket getTicket() {
        return ticket;
    }
}
