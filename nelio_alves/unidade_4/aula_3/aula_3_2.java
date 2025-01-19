package aula_3;

import java.util.Scanner;

public class aula_3_2 {

	public static void main(String[] args) {
		// Scanner parte 2
		//ler um texto até a quebra de linha
		
		Scanner sc = new Scanner(System.in);
		
		String s1, s2 , s3;
		
		s1= sc.nextLine();
		s2= sc.nextLine();
		s3= sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		/* o comando next irá ler só uma palabra
		 * já o nextLine irá ler toda linha até 
		 * apertar o enter */
		 
		sc.close();
		

	}

}
