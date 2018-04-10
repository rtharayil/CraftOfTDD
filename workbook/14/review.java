/*Kindly review the below code , how can we test Order Processor*/

public class OrderProcessor {
	public void process(Order order) {
		PricingService service = getPricingService();
		// use the PricingService object for processing the order
	}
	protected PricingService getPricingService() {
		return PricingService.getInstance();
	}
}
