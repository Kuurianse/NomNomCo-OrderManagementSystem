package payment;

public class CryptoPayment implements Payment{

	@Override
	public double calculatePrice(double basePrice) {
		return basePrice / 2;
	}

	@Override
	public String generatePaymentDetails() {
		String characters = "abcdefghijklmnopqrstuvwxyz123456789";
		StringBuilder cryptoAddress = new StringBuilder();
		for(int i = 0; i<10; i++) {
			cryptoAddress.append(characters.charAt((int)(Math.random() * characters.length())));
		}
		return cryptoAddress.toString();
	}

}
