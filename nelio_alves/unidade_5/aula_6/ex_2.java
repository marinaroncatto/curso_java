package aula_6;

public class ex_2 {

	public static void main(String[] args) {
		// alternativa para inicializar

		double price = 400.00;
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;			
		}else {
			discount = 0;
		}

		System.out.println(discount);
		

	}

}
