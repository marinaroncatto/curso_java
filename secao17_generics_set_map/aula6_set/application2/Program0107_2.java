package application2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program0107_2 {

	public static void main(String[] args) {
		// exemplo dois de Set<T>
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a); //a é passado como argumento, tornando c uma cópia do a
		c.addAll(b); //une o conjunto b com o c
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);//novamente cria uma cópia do a
		d.retainAll(b); //mantém somente os elementos em comum nos dois conjuntos
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b); //remove todos os números que estão no conjunto b (inclusive os repetidos que eram do a)
		System.out.println(e);

	}

}
