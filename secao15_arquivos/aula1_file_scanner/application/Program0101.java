package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program0101 {

	public static void main(String[] args) {
		// file e scanner: lendo um arquivo
		
		File file = new File("C:\\Users\\migue\\Documents\\Marina\\ws-eclipse\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		finally {
			if(sc !=null) {
				sc.close();
			}			
		}
	}

}
