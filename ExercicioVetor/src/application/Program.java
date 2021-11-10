package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		Quartos[] vect = new Quartos[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			sc.nextLine();
			System.out.println("Rent: #" + i + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Email: ");
			sc.nextLine();
			String email = sc.nextLine();
			
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Quartos(name, email);

			}

			System.out.println("Aluguel: ");
			for (int i=0; i < 10; i++) {
				if (vect[i] != null) {
					System.out.println(i + ": " + vect[i].toString());					
				}
				
			}
			sc.close();
		}

	}
