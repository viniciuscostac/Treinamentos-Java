package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
 
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		/*CurrencyConverter cc = new CurrencyConverter();*/
		
		System.out.println("What is the dollar price: ");
		CurrencyConverter.dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought: ");
		CurrencyConverter.quantity = sc.nextDouble();
		
		System.out.printf("Dollar: %.2f%n", CurrencyConverter.dollar);
		System.out.printf("Quantity: %.2f%n", CurrencyConverter.quantity);
		System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.amount());
		
		sc.close();
	}

}
