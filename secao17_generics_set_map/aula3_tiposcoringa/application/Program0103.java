package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program0103 {

	public static void main(String[] args) {
		// Tipos curinga (wildcard types)
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		//Porém não é possível adicionar dados a uma
		//coleção de tipo curinga
		//O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
		
		List<?> list = new ArrayList<Integer>();
		//list.add(3); // erro de compilação

	}
	
	public static void printList(List<?> list) {
		//O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga
		//Com tipos curinga podemos fazer métodos
		//que recebem um genérico de "qualquer tipo":
		
		for(Object obj: list) {
			System.out.println(obj);
		}
	}

}
