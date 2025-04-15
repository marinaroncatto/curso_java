package application;

import java.io.File;
import java.util.Scanner;

public class Program0106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: "+path.getName());
		//pega só o nome e despreza o caminho
		
		System.out.println("getParent: "+path.getParent());
		//mostra o caminho e despreza o nome
		
		System.out.println("getPath: "+path.getPath());
		//mostra o caminho todo
		
		sc.close();
	}

}
