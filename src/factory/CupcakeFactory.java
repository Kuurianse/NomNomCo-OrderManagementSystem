package factory;

import model.Confectionary;
import model.Cupcake;

public class CupcakeFactory extends ConfectionaryFactory{

	@Override
	protected Confectionary createConfectionary(String type, String name, String softness, String toppings,
			double price, String paymentType, String paymentNumber) {
		return new Cupcake(type, name, softness, toppings, price, paymentType, paymentNumber);
	}
	
}
