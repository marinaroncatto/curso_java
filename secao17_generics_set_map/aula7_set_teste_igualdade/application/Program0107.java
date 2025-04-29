package application;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import entities.Product1;

public class Program0107 {

	public static void main(String[] args) {
		//Como o Set compara seus elementos
		
		Set<Product1> set = new HashSet<>();
		
		set.add(new Product1("TV", 900.0));
		set.add(new Product1("Notebook", 1200.0));
		set.add(new Product1("Tablet", 400.0));
		
		Product1 prod = new Product1("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));
		//se o método HashCode e Equals não estiver implementado no product, o teste será por
		//pontos de memória e não de conteúdo.
		
		
		//Como o ThreeSet ordena seus dados
		
		Set<Product1> setT = new TreeSet<>();
		//O TreeSet usa o método compareTo para ordenar, por isso
		//a classe precisa ser uma implementação de Comparable		
		
		setT.add(new Product1("TV", 900.0));
		setT.add(new Product1("Notebook", 1200.0));
		setT.add(new Product1("Tablet", 400.0));
		
		for (Product1 p : setT) {
		System.out.println(p);
		}

	}
}
