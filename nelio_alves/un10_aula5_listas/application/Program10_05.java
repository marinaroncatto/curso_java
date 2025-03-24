package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program10_05 {

	public static void main(String[] args) {
		// Listas
		
		List<String> list = new ArrayList<String>(); 
		//não aceita tipos primitivos
		
		//adicionar
		
		list.add("Maria"); //adiciona elemento
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco"); //adiciona na posição específica
		
		System.out.println(list.size());//mostra o tamanho da lista
		
				
		for(String x: list) {
			System.out.println(x);			
		}

		
		System.out.println("------------");
		
		//remover
		
		//list.remove("Anna"); //remove por valor
		//list.remove(1); // remove por posição
		
		//remover com predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x: list) {
			System.out.println(x);			
		}
		
		System.out.println("------------");
		
		//encontrar posição de elemento
		
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		//quando o index of não encontra um elemento ele retorna -1
		
		System.out.println("------------");
		
		//filtrando listas
		
		List<String> result = list.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
																		// permite que o tipo lista use expressões lambda
		for(String x : result) {
			System.out.println(x);
			//imprime somente quem começa com A
		}
		
		//encontrar primeiro elemento de algum critério
		
		System.out.println("------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//se o elemento não for encontrado, retornará nulo
		
		System.out.println(name);
	}

}
