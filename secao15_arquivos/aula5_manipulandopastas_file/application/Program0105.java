package application;

import java.io.File;
import java.util.Scanner;

public class Program0105 {
	public static void main(String[] args) {
		//manipulando pastas com file
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath); //caminho digitado é passado para o File
		
		File[] folders = path.listFiles(File::isDirectory);
		//função para ir até o caminho e ler somente quem é diretório
		System.out.println("FOLDERS:");
		for(File folder : folders) {
			System.out.println(folder);
		}
				
		File[] files = path.listFiles(File::isFile);
		//função para ler somente quem é arquivo
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath +"\\subdir").mkdir();
		//cria uma nova pasta no caminho indicado chamada "subdir"
		System.out.println("Directory created successfully: "+success);
		sc.close();
	}
}
