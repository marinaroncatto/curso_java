package aaplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program0102 {
	public static void main(String[] args) {
		//FileReader e BufferedReader
		//stream = sequencia
		
		String path = "C:\\Users\\migue\\Documents\\Marina\\ws-eclipse\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); // é instanciado a partir do filereader
			//deixa a leitura mais rápida
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		finally {
			
			try {
				if(br != null) 
					br.close();
				
				if(fr != null) 
					fr.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
