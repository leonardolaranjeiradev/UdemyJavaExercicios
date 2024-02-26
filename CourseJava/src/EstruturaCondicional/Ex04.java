package EstruturaCondicional;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora inicial:");
		int horaInicial = sc.nextInt();
		System.out.println("Hora final:");
		int horaFinal = sc.nextInt();		
		int duracao = 0;
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
			System.out.println("O JOGO DUROU " + duracao + "  HORA(S)");
		} else {
			int primeiroDia = 24 - horaInicial;
			int segundoDia = horaFinal;			
			duracao = primeiroDia + segundoDia;			
			System.out.println("O JOGO DUROU " + duracao + "  HORA(S)");
		}		
		sc.close();

	}

}
