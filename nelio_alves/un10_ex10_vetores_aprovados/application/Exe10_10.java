package application;

import java.util.Locale;
import java.util.Scanner;

public class Exe10_10 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		double[] n1s = new double[n];
		double[] n2s = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			n1s[i] = sc.nextDouble();
			n2s[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i < n; i++) {
			
			double media = (n1s[i] +n2s[i]) / 2;
			
			if (media >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		sc.close();
	}

}
