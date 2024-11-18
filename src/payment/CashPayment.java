package payment;

public class CashPayment implements Payment{

	@Override
	public double calculatePrice(double basePrice) {
		return basePrice;
	}

	@Override
	public String generatePaymentDetails() {
		return "paid with Cash";
	}

}
