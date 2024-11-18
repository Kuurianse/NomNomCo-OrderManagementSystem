package model;

public abstract class Confectionary {
	
	protected String type;
	protected String name;
	protected String softness;
	protected String toppings;
	protected double price;
	protected String paymentType;
	protected String paymentNumber;
	
	public Confectionary(String type, String name, String softness, String toppings, double price, String paymentType,
			String paymentNumber) {
		super();
		this.type = type;
		this.name = name;
		this.softness = softness;
		this.toppings = toppings;
		this.price = price;
		this.paymentType = paymentType;
		this.paymentNumber = paymentNumber;
	}
	
	public abstract void prepare();
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSoftness() {
		return softness;
	}
	public void setSoftness(String softness) {
		this.softness = softness;
	}
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getPaymentNumber() {
		return paymentNumber;
	}
	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	
}
