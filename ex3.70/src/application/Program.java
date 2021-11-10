package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Estudante estudante = new Estudante();
		
		estudante.name = sc.next();
		estudante.grade1 = sc.nextDouble();
		estudante.grade2 = sc.nextDouble();
		estudante.grade3 = sc.nextDouble();
		
		System.out.printf("Final Grade: %.2f%n", estudante.finalGrade());
		
		if (estudante.finalGrade() < 60.0) {
			System.out.println("Failed");
			System.out.println("Missing " + estudante.missingPoints() + " points");
			 
		}
		else {
			System.out.println("PASS");
		}
		
		
		
	}

}
