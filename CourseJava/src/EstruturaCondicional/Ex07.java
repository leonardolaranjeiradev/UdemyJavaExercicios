package EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas                |Y                                         
		de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o          Q2       |    Q1                                
		ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).                         |            X                       
		Se o ponto estiver na origem, escreva a mensagem “Origem”.                             ------------|------------                                          
		Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a                 |                                      
		situação.                                                                                 Q3       |    Q4 
		                                                                                                   |		                               
		
		*/     
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor de X:");
		double x = sc.nextDouble();
		System.out.println("Entre com o valor de Y:");
		double y = sc.nextDouble();		
	
		if (x > 0.0 && y > 0.0) {
			System.out.println("Q1");
		} else if (x < 0.0 && y > 0.0) {
			System.out.println("Q2");
		} else if (x < 0.0 && y < 0.0) {
			System.out.println("Q3");
		} else if (x > 0.0 && y < 0.0) {
			System.out.println("Q4");
		} else {
			System.out.println("Origem");
		}		
		sc.close();
	}

}
