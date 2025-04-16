package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exe {

	public static void main(String[] args) {
		/*
Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo.
		 */
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		List<Product> list = new ArrayList<>();
		
		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		//obetendo o caminho do arquivo
		
		boolean success = new File(sourceFolderStr+"\\out").mkdir();
		
		//System.out.println("Folder created: "+success);
		//testando se a pasta foi criada
		
		String targetFileStr = sourceFolderStr +"\\out\\sumary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				System.out.println(itemCsv);
								
				String [] fields = itemCsv.split(","); //quebra a linha em três valores a partir da virgula
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Product(name, price, quantity));
				
				itemCsv = br.readLine();//lê a próxima linha
			}//fim while
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				//criar um arquivo do zero imprimindo os valores de saída
				
				for(Product item: list) {
					bw.write(item.getName() +", "+ String.format("%.2f",  item.total()));
					bw.newLine();
				}
				
				System.out.println(targetFileStr+ " CREATED");
				
			}catch(IOException e) {
				System.out.println("Error writing file: "+e.getMessage());
			}
		
		}catch(IOException e) {
			System.out.println("Error reading file: "+e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		sc.close();

	}

}
