package main;

import java.util.Scanner;

import factory.ConfectionaryFactory;
import factory.CupcakeFactory;
import factory.TartFactory;
import model.Confectionary;
import payment.Payment;
import payment.PaymentAdapter;
import repository.ConfectionaryHistory;

public class Main {
	
	private Scanner scan;
	private ConfectionaryHistory history;
	private ConfectionaryFactory cupcakeMarket, tartMarket;
	
	public Main() {
		init();
		int input;
		
		do {
			cls();
			System.out.println("Nom Nom co.");
			System.out.println("===========");
			System.out.println("1. Bake Confectionary");
			System.out.println("2. View Confectionary Order");
			System.out.println("3. Exit");
			System.out.print(">> ");
			input = scan.nextInt();
			scan.nextLine();
			
			switch(input) {
			case 1:
				cls();
				bakeConfectionary();
				break;
			case 2:
				cls();
				viewConfectionaryOrder();
				break;
			}
			
		}while(input != 3);
		
		cls();
		exit();
	}
	
	private void bakeConfectionary() {
		String type;
		while(true) {
			System.out.print("Input confectionary type [Cupcake | Tart][case sensitive]: ");
			type = scan.nextLine();
			if(type.equals("Cupcake") || type.equals("Tart")) {
				break;
			}
		}
		System.out.println(type);
		
		String name;
		while(true) {
			System.out.print("Input confectionary name [length between 5 - 15]: ");
			name = scan.nextLine();
			if(name.length() >= 5 && name.length() <= 15) {
				break;
			}
		}
		System.out.println(name);
		
		String softness;
		while(true) {
			System.out.print("Input confectionary softness [Fluffy | Medium | Hard][case sensitive]: ");
			softness = scan.nextLine();
			if(softness.equals("Fluffy") || softness.equals("Medium") || softness.equals("Hard")) {
				break;
			}
		}
		System.out.println(softness);
		
		String yOrN;
		while(true) {
			System.out.print("Adding additional topping [Y | N][case sensitive]: ");
			yOrN = scan.nextLine();
			if(yOrN.equals("Y") || yOrN.equals("N")) {
				break;
			}
		}
		System.out.println(yOrN);
		
		String allToppings = null;
		if(yOrN.equals("Y")) {
			String[] toppings = new String[3];
			
			for(int i = 0; i<3; i++) {
				int x = i+1;
				while(true) {
					System.out.print("Input topping "+ x +"[length between 1 - 10]: ");
					toppings[i] = scan.nextLine();
					if(toppings[i].length() >= 1 && toppings[i].length() <= 10) {
						break;
					}
				}
			}
			allToppings = String.join(" ", toppings);
		}else if(yOrN.equals("N")) {
			allToppings = "-";
		}
		System.out.println(allToppings);
		
		double price;
		while(true) {
			System.out.print("Input confectionary price [10.0 - 50.0]: ");
			price = scan.nextDouble();
			scan.nextLine();
			if(price >= 10 && price <= 50) {
				break;
			}
		}
		System.out.println(price);
		
		String paymentType;
		while(true) {
			System.out.print("What kind of payment [Cash | Transfer | Crypto][case sensitive]: ");
			paymentType = scan.nextLine();
			if(paymentType.equals("Cash") || paymentType.equals("Transfer") || paymentType.equals("Crypto")) {
				break;
			}
		}
		System.out.println(paymentType);
		
		Payment payment = PaymentAdapter.getPaymentMethod(paymentType);
		
		double finalPrice = payment.calculatePrice(price);
		String paymentNumber = payment.generatePaymentDetails();
		System.out.println(finalPrice);
		System.out.println(paymentNumber);
		scan.nextLine();
		
		if(type.equals("Cupcake")) {
			order(cupcakeMarket, type, name, softness, allToppings, finalPrice, paymentType, paymentNumber);
		}else if(type.equals("Tart")) {
			order(tartMarket, type, name, softness, allToppings, finalPrice, paymentType, paymentNumber);
		}
	}
	
	private void viewConfectionaryOrder() {
		boolean isEmpty = history.isEmpty();
		if(isEmpty) {
			System.out.println("No Confectionary Yet!");
		}else {
			history.showConfectionary();
		}
		System.out.println("Press enter to continue ...");
		scan.nextLine();
	}
	
	private void init() {
		scan = new Scanner(System.in);
		cupcakeMarket = new CupcakeFactory();
		tartMarket = new TartFactory();
		history = ConfectionaryHistory.getInstance();
	}
	
	private void order(ConfectionaryFactory factory, String type, String name, String softness, String toppings, double price, String paymentType,
			String paymentNumber) {
		Confectionary cf = factory.orderConfectionary(type, name, softness, toppings, price, paymentType, paymentNumber);
		history.addToHistory(cf);
	}
	
	private void cls() {
		for(int i = 0; i<10; i++) {
			System.out.println("\n\n\n");
		}
	}
	
	private void exit() {
		System.out.println("Press enter again to exit ...");
		scan.nextLine();
	}

	public static void main(String[] args) {
		new Main();
	}

}
