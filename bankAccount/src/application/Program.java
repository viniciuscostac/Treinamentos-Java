package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int account = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String name = sc.next();
		
		/* ToString */
		
		System.out.println("Enter a deposite value: ");
		double deposite = sc.nextDouble();
		
		System.out.println("Updated account data:");
		/* ToString */
		
		System.out.println("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		
		System.out.println("Updated account data: ");
		/* ToString */

	}

}
