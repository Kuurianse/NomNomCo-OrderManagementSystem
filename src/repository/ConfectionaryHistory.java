package repository;

import java.util.ArrayList;

import model.Confectionary;

public class ConfectionaryHistory {
	private ArrayList<Confectionary> confectionaries;
	private static ConfectionaryHistory instance;
	
	private ConfectionaryHistory() {
		confectionaries = new ArrayList<Confectionary>();
	}
	
	public static ConfectionaryHistory getInstance() {
		if(instance == null) instance = new ConfectionaryHistory();
		return instance;
	}
	
	public void showConfectionary() {
		double totalSpend = 0;
		
		for(Confectionary confectionary : confectionaries) {
			System.out.printf("%-15s : %s (%s)\n", "Name", confectionary.getName(), confectionary.getType());
			System.out.printf("%-15s : %s\n", "Softness", confectionary.getSoftness());
			System.out.printf("%-15s : %s\n", "Toppings", confectionary.getToppings());
			System.out.printf("%-15s : %s\n", "PaymentType", confectionary.getPaymentType());
			
			String paymentType = confectionary.getPaymentType();
			switch(paymentType) {
				case "Cash":
					System.out.printf("%-15s : %.1f\n", "Price", confectionary.getPrice());
					break;
				case "Transfer":
					System.out.printf("%-15s : %.1f with Account Number : %s\n", "Price", confectionary.getPrice(), confectionary.getPaymentNumber());
					break;
				case "Crypto":
					System.out.printf("%-15s : %.1f with Address : %s\n", "Price", confectionary.getPrice(), confectionary.getPaymentNumber());
					break;
			}
		    
			totalSpend += confectionary.getPrice();
			System.out.println();
		}
		System.out.printf("\n  Total Spend: %.1f\n\n", totalSpend);
	}
	
	public boolean isEmpty() {
		int i = 0;
		for(Confectionary confectionary : confectionaries) {
			i++;
		}
		if(i < 1) {
			return true;
		}
		return false;
	}
	
	public void addToHistory(Confectionary cf) {
		confectionaries.add(cf);
	}
}
