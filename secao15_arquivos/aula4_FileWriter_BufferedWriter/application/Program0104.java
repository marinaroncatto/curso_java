package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program0104 {

	public static void main(String[] args) {
		// FileWriter e BufferedWriter
		
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night"};
		
		//criar um arquivo para gravar os dados nele
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter(path))
		//Desta forma acima ele gera um novo arquivo e grava. Se o arquivo já existe
		//ele irá destruir o que tinha e gravar por cima.
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))
		//ao adicionar o parametro true, o programa passará a acrescentar logo após o 
		//que já estava escrito no arquivo, sem deletar o que havia antes
		
		
		String path = "C:\\Users\\migue\\Documents\\Marina\\ws-eclipse\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String line : lines) {
				bw.write(line); 
				bw.newLine(); //gera quebra de linha
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
