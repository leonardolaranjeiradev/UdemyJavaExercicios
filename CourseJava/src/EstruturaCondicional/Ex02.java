package EstruturaCondicional;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro 
		//e dizer se este número é par ou ímpar.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com um número:");
		int n1 = sc.nextInt();
		
		if (n1 % 2 == 0) {
			System.out.println("Seu número é PAR");
		} else {
			System.out.println("Seu número é IMPAR");
		}		
		sc.close();
	}

}
