package application;

import java.util.Scanner;

public class Program10_06 {

	public static void main(String[] args) {
		// matrizes
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; //instanciando matriz
		
		for(int i = 0; i < mat.length; i++) {//preenche as linhas
			for(int j = 0; j < mat[i].length; j++) {//preenche as colunas
				mat[i][j] = sc.nextInt();
			}
		}
		
		//mostrar os valores da diagonal principal
		
		System.out.println("Main diagonal: ");
		for(int i = 0; i <mat.length; i++) {
			System.out.print(mat[i][i]+ " ");
		}
		
		System.out.println();
		
		int count = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j =0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = "+count);
		
		
		sc.close();
	}

}
