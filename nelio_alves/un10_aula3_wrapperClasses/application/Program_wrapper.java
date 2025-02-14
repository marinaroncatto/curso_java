package application;

public class Program_wrapper {

	public static void main(String[] args) {
		// wrapper class - aceita nulo e dispensa necessidade de conversão				
			
			//boxing
			int x = 20;
			
			Integer obj = x; //Classe equivalente ao int
			
			
			System.out.println(obj);
			
			// unboxing
			
			int y = obj * 2; // dispensa o casting
			
			System.out.println(y);
		}

	

}
