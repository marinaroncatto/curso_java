package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program07 {

	public static void main(String[] args) {
		// TODO pipeline demo
		
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		
		//multiplica cada elemento da list por 10
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		//calcula a soma de todos os elementos da lista, iniciando com o valor 0
		int sum = list.stream().reduce(0, (x, y) -> x + y);
		System.out.println("Sum = " + sum);
		
		//filtra os números pares e multiplica por 10
		List<Integer> newList = list.stream()
				.filter(x -> x % 2 ==0)
				.map(x -> x * 10)
				.collect(Collectors.toList());
		System.out.println(Arrays.toString(newList.toArray()));
	}

}
