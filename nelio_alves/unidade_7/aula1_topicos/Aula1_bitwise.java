package aula1_topicos;

import java.util.Scanner;

public class Aula1_bitwise {

	public static void main(String[] args) {
		// testando o 6h bit
		
		Scanner sc = new Scanner(System.in);
		
		int mask =  0b100000; //equivale a 32 dec
		//java também aceita números em binário
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6yh bit is true!");
		}else {
			System.out.println("6yh bit is false!");
		}
		sc.close();

	}

}
