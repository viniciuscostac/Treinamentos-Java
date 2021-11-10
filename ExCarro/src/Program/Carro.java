package Program;

import entities.CCarro;

import java.util.Scanner;

public class Carro {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Quantidade de Pessoas");
		int quantity = sc.nextInt();
		
		System.out.println("Adicionando Pessoas:");
		
		CCarro ccarro = new CCarro(quantity);
		
		System.out.println("Quantas pessoas entrarão no carro: ");
		quantity = sc.nextInt();
		ccarro.addPessoas(quantity);
		
		System.out.printf("Quantidade Atualizada:" + ccarro.TotalPessoas());
	
		System.out.println("Quantas pessoas sairão do carro: ");
		quantity = sc.nextInt();
		ccarro.removePessoas(quantity);
		
		

	}

}
	