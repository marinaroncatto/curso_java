package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Studant;

public class Exe3 {

	public static void main(String[] args) {
		// aprovação de aluno
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studant stu = new Studant();
		
		stu.name = sc.nextLine();
		stu.n1 = sc.nextDouble();
		stu.n2 = sc.nextDouble();
		stu.n3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n",stu.finalGrade());		
		
		if(stu.finalGrade() >= 60.0) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			double missing = 60.0 - stu.finalGrade();
			System.out.printf("MISSING %.2f POINTS",missing);
		}
		
		
		sc.close();

	}

}
