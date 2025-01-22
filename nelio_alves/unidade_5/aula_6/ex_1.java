package aula_6;

public class ex_1 {

	public static void main(String[] args) {
		// escopo e inicialização
		
		double price = 400.00;
		
		if (price < 200.00) {
			double discount = price * 0.1;
			//essa variável só poderá ser 
			//acessada dentro dessa condição
		}			
		
		System.out.println(price);
		// a variável precisa ser iniciada com 
		//algum valor ou Scanner ou não compila.

	}

}
