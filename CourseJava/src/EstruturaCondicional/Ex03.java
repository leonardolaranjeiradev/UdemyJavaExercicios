package EstruturaCondicional;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
		ordem crescente ou decrescente.*/ 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número:");
		int A = sc.nextInt();
		System.out.println("Entre com o segundo número:");
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são Multiplos");
		}		
		sc.close();
	}

}
