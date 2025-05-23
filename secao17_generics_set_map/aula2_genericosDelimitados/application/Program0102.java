package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import entities.Product1;
import services.CalculationService;

public class Program0102 {

	public static void main(String[] args) {
		// genéricos delimitados
		
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		String path = "C:\\Users\\migue\\Documents\\Marina\\ws-eclipse\\in2.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0],Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive: ");
			System.out.println(x);
			
		} catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
