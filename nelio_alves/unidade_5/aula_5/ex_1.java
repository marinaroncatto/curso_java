package aula_5;

public class ex_1 {

	public static void main(String[] args) {
		// expressão condicional ternária
		
		double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}else {
			desconto = preco * 0.05;
		}
		
		System.out.println(desconto);
	}

}
