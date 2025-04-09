package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// estudos para prova		

		//contar letras em java
		Scanner sc = new Scanner(System.in);
		
		String palavra = "cacatua";
		System.out.println("palabra");
		String outra = sc.nextLine();
		
		//System.out.println(contLetras(palavra));
		
		System.out.println(outra.length());
		// Converter String para número 
		
		//String numero = "1";
		
	
		System.out.println("numero");
		String numero = sc.next(); 
				
		//int num = Integer.valueOf(numero); //retorna um int
		
		int num = Integer.parseInt(numero); //retorna um Integer
		
		System.out.println(num+1);
		
		
		Double doub = Double.valueOf(numero); // retorna o valor primitivo
		//Double doub = Double.parseDouble(numero); // retorna uma Wrapper class
		System.out.println(doub);
		
		//substituir
		
		String replace = palavra.replace('a', 'o');
		System.out.println(replace);
	
	}
	
	public static Integer contLetras(String palav) {
		return palav.length();
	}

}
