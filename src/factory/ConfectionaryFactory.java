package factory;

import model.Confectionary;

public abstract class ConfectionaryFactory {
	
	public Confectionary orderConfectionary(String type, String name, String softness, String toppings, double price, String paymentType,
			String paymentNumber) {
		Confectionary cf = createConfectionary(type, name, softness, toppings, price, paymentType, paymentNumber);
		cf.prepare();
		return cf;
	}
	
	protected abstract Confectionary createConfectionary(String type, String name, String softness, String toppings, double price, String paymentType,
			String paymentNumber);
}
