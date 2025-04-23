package application;

import java.util.Scanner;

import services.PrintService;

public class Program0101 {

	public static void main(String[] args) {
		// usando uma classe com tipo generic
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		Integer x = ps.first();
		System.out.println("First: "+x);
		
		sc.close();

	}

}
