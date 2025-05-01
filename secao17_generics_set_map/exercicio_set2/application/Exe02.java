package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Exe02 {

	public static void main(String[] args) {
		/*
		 * Em um portal de cursos online, cada usuário possui um código único, representado por
			um número inteiro.
			Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
			matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
			é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
			alunos repetidos em mais de um curso.
			O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
			Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
			quantidade total e alunos dele, conforme exemplo.
		 */

		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int id = sc.nextInt();
			set.add(new Student(id));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int id = sc.nextInt();
			set.add(new Student(id));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int id = sc.nextInt();
			set.add(new Student(id));
		}
		
		System.out.println("Total students: "+ set.size());
		
		
		
		
		sc.close();
	}

}
