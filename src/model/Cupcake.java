package model;

public class Cupcake extends Confectionary{

	public Cupcake(String type, String name, String softness, String toppings, double price, String paymentType,
			String paymentNumber) {
		super(type, name, softness, toppings, price, paymentType, paymentNumber);
	}

	@Override
	public void prepare() {
		System.out.println("Confectionary Baked!");
		System.out.println("Press enter to continue ...");
	}
	
}
