package aula_3;

import java.util.Scanner;

public class aula_3_3 {

	public static void main(String[] args) {
		// quebra de linha pendente
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2 , s3;
		
		x= sc.nextInt();
		sc.nextLine(); //extra
		s1= sc.nextLine();
		s2= sc.nextLine();
		s3= sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
		/*quando usamos qualquer comando de leitura
		 * diferente do nextLine antes dele irá gerar
		 * uma quebra de linha pendente que comerá o espaço
		 * do primeiro input nextLIne
		 * Uma solução é colocar um nextLine extra nesses casos */
	}

}
