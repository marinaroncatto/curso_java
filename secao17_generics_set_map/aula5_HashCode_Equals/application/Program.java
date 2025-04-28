package application;

import entities.Client;

public class Program {
	
	public static void main(String[] args) {
		 // HashCode and Equals
		
		
		Client c1 = new Client("Maria", "maria@gmial.com");
		Client c2 = new Client("Maria", "maria@gmial.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		String s3 = new String("Test");
		String s4 = new String("Test");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2)); //compara conteúdo do objeto
		System.out.println(c1 == c2); //para objetos compara referência de memória no heap
		System.out.println(s1 == s2);//para literais compara o conteúdo
		System.out.println(s3 == s4);
		
	}
}
