package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// Com base na tabela abaixo, escreva um programa que leia o código de um item e
		// a quantidade deste item. A
		// seguir, calcule e mostre o valor da conta a pagar.

		/*
		 * CODIGO 						ESPECIFICACAO 					PRECO 
		 * 1 							Cachorro Quente 				R$ 4.00 
		 * 2 							X-Salada 						R$ 4.50 
		 * 3							X-Bacon 						R$ 5.00 
		 * 4 							Torrada simples 				R$ 2.00 
		 * 5 							Refrigerante 					R$ 1.50
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do produto:");
		int codigo = sc.nextInt();
		System.out.println("Digite a quantidade:");
		int quantidade = sc.nextInt();
		double conta = 0.0;

		if (codigo == 1) {
			conta = quantidade * 4.0;
		} else if (codigo == 2) {
			conta = quantidade * 4.50;
		} else if (codigo == 3) {
			conta = quantidade * 5.0;
		} else if (codigo == 4) {
			conta = quantidade * 2.0;
		} else if (codigo == 5) {
			conta = quantidade * 1.50;
		} else {
			System.out.println("Digite um código valido");
		}
		System.out.printf("Total a pagar: R$%.2f%n", conta);

		sc.close();

	}

}
