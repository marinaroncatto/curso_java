package application;

import java.util.Scanner;

public class Exe_10_matrizes {

	public static void main(String[] args) {
		// desafio matrizes
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o número de linhas da matriz: ");
		int l = sc.nextInt();
		
		System.out.println("Insira o número de colunas da matriz: ");
		int c = sc.nextInt();
		
		int[][] mat = new int[l][c];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Qual número deseja encontrar? ");
		int n = sc.nextInt();
		
		for(int i =0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == n) {
					System.out.println("Position "+ i +","+j+":");
												
						if(j > 0) 
							System.out.println("Left:  "+mat[i][j-1]);
							
						if(j < mat[i].length -1)
						System.out.println("Right:  "+mat[i][j+1]);
						
						if(i > 0) 
							System.out.println("Up:  "+mat[i-1][j]);
						
						if( i < mat.length -1)
						System.out.println("Down:  "+mat[i+1][j]);
				}
			}
		}
		
		sc.close();

				
	}

}
