import java.util.List;
import java.util.Map;

public class ParkingLot {
   private List<Floor> floors;
   private Map<String, Ticket> activeTickets;
   private final PricingService pricingService;
   int ticketCounter;

    public ParkingLot(List<Floor> floors, Map<String, Ticket> activeTickets,
                      PricingService pricingService, int ticketCounter) {
        this.floors = floors;
        this.activeTickets = activeTickets;
        this.pricingService = pricingService;
        this.ticketCounter = ticketCounter;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public void setActiveTickets(Map<String, Ticket> activeTickets) {
        this.activeTickets = activeTickets;
    }

    public void setTicketCounter(int ticketCounter) {
        this.ticketCounter = ticketCounter;
    }


    public ParkingResult park(Vehicle vehicle , SpotType spot){

        	/*
    1.	Validate compatibility
	2.	Search floors
	3.	Occupy spot
	4.	Create ticket
	5.	Store ticket
	6.	Return result
        	 */

        ParkingResult parkingResult = null;

        return parkingResult;
    }
    public PaymentResult exit(String ticketId){

        /*
        1.	Lookup ticket
        2.	If null → invalid
        3.	Calculate price
        4.	Free spot
        5.	Remove from activeTickets
        6.	Return payment result

         */
       PaymentResult paymentResult = null;
       return paymentResult;

    }



}
