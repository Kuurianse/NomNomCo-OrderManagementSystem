package payment;

public class TransferPayment implements Payment{

	@Override
	public double calculatePrice(double basePrice) {
		return basePrice * 1.1;
	}

	@Override
	public String generatePaymentDetails() {
		StringBuilder accountNumber = new StringBuilder();
		for(int i = 0; i<10; i++) {
			accountNumber.append((int)(Math.random() * 10));
		}
		return accountNumber.toString();
	}
	
}
