package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program0102 {

	public static void main(String[] args) {
		// pilhas de chamadas de métodos
		
		method1();
				
		System.out.println("End of program");
	
} //fim main
	

public static void method1() {
	System.out.println("#### METHOD 1 START ####");
	
	method2();
	
	System.out.println("#### METHOD 1 END ####");
}
	

public static void method2() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("#### METHOD 2 START ####");
	
	try {
	String[] vect = sc.nextLine().split(" ");
	int position = sc.nextInt();
	System.out.println(vect[position]);
	
	}
	catch(ArrayIndexOutOfBoundsException e){
		System.out.println("Invalid position!");
		e.printStackTrace(); //mapeia onde o erro ocorreu		
	}
	catch(InputMismatchException e){
		System.out.println("Input error");		
	}
	sc.close();
	
	System.out.println("#### METHOD 2 END ####");
 }

}//fim da classe
