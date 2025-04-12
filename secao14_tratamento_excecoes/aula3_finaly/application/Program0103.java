package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program0103 {

	public static void main(String[] args) {
		// bloco finaly

		File file = new File("C:\\Users\\migue\\Documents\\Marina\\ws-eclipse\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("Finaly block executed");
		}

	}

}
