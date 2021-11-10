package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Funcionario funcionario = new Funcionario();

		System.out.println("Name: ");
		funcionario.name = sc.next();
		System.out.println("Gross Salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		funcionario.tax = sc.nextDouble();	
		
		System.out.println();
		System.out.println("Funcionario: " + funcionario);
		
		System.out.println("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		funcionario.IncreaseSalary(percentage);
		
		System.out.println("Updated data: " + funcionario);
		
		sc.close();
	}

}
