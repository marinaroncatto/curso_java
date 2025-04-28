package application1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program0107 {

	public static void main(String[] args) {
		// Set<T>
		
		Set<String> setH = new HashSet<>(); 
		//HashSet é o mais rápido, porém não garante a
		//ordem dos dados. 
		//INDICADO QUANDO A ORDEM NÃO IMPORTA
		
		setH.add("TV");
		setH.add("Tablet");
		setH.add("Notebook");
		
		System.out.println("Contém Notebook? "+setH.contains("Notebook"));
		
		System.out.println("Lista HashSet:");
		for(String p: setH){
			System.out.println(p);
		}
		
		Set<String> setT = new TreeSet<>(); 
		//TreeSet é o mais lento, mas ordena todos os elementos
		//do menor para o maior
		
		setT.add("Tv");
		setT.add("Tablet");
		setT.add("Notebook");
		
		System.out.println();
		System.out.println("Contém Notebook? "+setT.contains("Notebook"));
		
		System.out.println("Lista TreeSet:");
		for(String p: setT){
			System.out.println(p);
		}
		
		Set<String> setL = new LinkedHashSet<>(); 
		//LinkedHashSet possui velocidade intermediária
		//mantém a ordem de entrada dos elementos
		
		setL.add("Tv");
		setL.add("Tablet");
		setL.add("Notebook");
		
		System.out.println();
		System.out.println("Contém Notebook? "+setL.contains("Notebook"));
		//operação para saber se o Set contém um dado
		
		
		System.out.println("Lista LinkedHashSet:");
		for(String p: setL){
			System.out.println(p);
		}
		
		//Outras operações
		System.out.println();
		System.out.println("OPERAÇÕES");
		System.out.println();
		
		setL.remove("Tablet");
		setT.removeIf(x -> x.length() >=3); //remove todos com mais de dois caracteres
		setH.removeIf(x -> x.charAt(0) == 'T');
		
		System.out.println("Lista LinkedHashSet:");
		for(String p: setL){
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Lista TreeSet:");
		for(String p: setT){
			System.out.println(p);
		}
		
		System.out.println();
		System.out.println("Lista HashSet:");
		for(String p: setH){
			System.out.println(p);
		}
		
		
	}

}
