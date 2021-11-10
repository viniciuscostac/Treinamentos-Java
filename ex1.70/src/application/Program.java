package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Enter rectangle width and height: ");
		retangulo.Width = sc.nextDouble();
		retangulo.Height = sc.nextDouble();
		
		System.out.println("Área = %.2f%n" + retangulo.Area());
		System.out.println("Perimeter = %.2f%n" + retangulo.Perimeter());
		System.out.println("Diagonal = %.2f%n" + retangulo.Diagonal());
		
		sc.close();
	}

}
