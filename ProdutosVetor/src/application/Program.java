package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		
		double soma = 0.0;
		for(int i=0; i < vect.length; i++) {
			soma += vect[i].getPrice();
		}
		
		double media = soma/vect.length;
		
		System.out.printf("Média de Preço: %.2f%n", media);
		
		sc.close();
		
	}

}
