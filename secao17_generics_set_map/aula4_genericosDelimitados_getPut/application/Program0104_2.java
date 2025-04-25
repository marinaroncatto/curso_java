package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program0104_2 {

	public static void main(String[] args) {
		// Vamos fazer um método que copia os elementos de uma lista para uma
		//outra lista que pode ser mais genérica que a primeira.
		
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<>();						

		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
		
	}
	
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		//List<? extends Number> source --> Princípio get/put - covariância get ok
		//List<? super Number> destiny --> Princípio get/put - contravariância put ok
		for(Number n : source) {
			destiny.add(n);
		}
	}
	
	
	
	public static void printList(List<?> list) {
		for(Object obj: list) {
			System.out.println(obj + " ");
		}
		System.out.println();
	}

}
