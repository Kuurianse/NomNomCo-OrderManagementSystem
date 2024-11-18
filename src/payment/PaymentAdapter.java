package payment;

public class PaymentAdapter {
	public static Payment getPaymentMethod(String paymentType) {
		switch(paymentType) {
		case "Cash":
			return new CashPayment();
		case "Transfer":
			return new TransferPayment();
		case "Crypto":
			return new CryptoPayment();
		default:
			throw new IllegalArgumentException("Invalid payment type");
		}
	}
}
