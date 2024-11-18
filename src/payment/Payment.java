package payment;

public interface Payment {
	double calculatePrice(double basePrice);
	String generatePaymentDetails();
}
