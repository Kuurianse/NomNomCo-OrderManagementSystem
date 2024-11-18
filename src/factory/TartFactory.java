package factory;

import model.Confectionary;
import model.Tart;

public class TartFactory extends ConfectionaryFactory{

	@Override
	protected Confectionary createConfectionary(String type, String name, String softness, String toppings,
			double price, String paymentType, String paymentNumber) {
		return new Tart(type, name, softness, toppings, price, paymentType, paymentNumber);
	}
	
}
