import java.util.HashMap;
import java.util.Map;

public class PricingService {

   private final Map<VehicleType,Double> rates;
   private final DiscountService discountService;

    public PricingService(Map<VehicleType, Double> rates, DiscountService discountService) {
        this.discountService = discountService;
        this.rates = rates;

    }


        public double calculatePrice(Ticket ticket ){
            double amount =0;

            // Logic

            /*
            if discount Applicable
             */

            amount = discountService.applyDiscount(10.20);
            /*
             return amount;
             */

            /*
            if discount not applicable return this amount
             */
            return amount;
        }

}
