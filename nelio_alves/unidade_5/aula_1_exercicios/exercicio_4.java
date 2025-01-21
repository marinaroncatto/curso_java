package aula_1_exercicios;

import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que o
		 *  mesmo pode começar em um dia e terminar em outro, 
		 *  tendo uma duração mínima de 1 hora e máxima de
		 *   24 horas.
		 */
		Scanner sc = new Scanner(System.in);
		int tempo;
		int hi = sc.nextInt();
		int hf = sc.nextInt();
		
		if (hi < hf) {					
			tempo = hf-hi;
			 System.out.printf("O JOGO DUROU %d HORA(S)", tempo);			
		}else {
			tempo = 24-hi+hf;
			 System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		}
		
		
		sc.close();
	}

}
