package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program06 {

	public static void main(String[] args) {
		// TODO streams
		
		//transformando lista em stream
		List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
		Stream<Integer> st1 = list.stream();
		System.out.println(Arrays.toString(st1.toArray()));
		
		//criando uma stream direto com dados
		Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); //cria uma stream direto
		System.out.println(Arrays.toString(st2.toArray()));
		
		//criando uma stream com o iterate (precisa usar o limit, pois se não será infinito)
		Stream<Integer> st3 = Stream.iterate(0, x -> x+2);
		System.out.println(Arrays.toString(st3.limit(10).toArray()));
		
		//ex: números de fibonatti
		Stream<Long> st4 = Stream.iterate(new long[] { 0L, 1L}, p -> new long[] {p[1], p[0]+p[1] }).map(p -> p[0]);
		System.out.println(Arrays.toString(st4.limit(20).toArray()));
		

	}

}
