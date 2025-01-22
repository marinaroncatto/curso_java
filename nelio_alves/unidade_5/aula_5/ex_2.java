package aula_5;

public class ex_2 {

	public static void main(String[] args) {
		// expressão condicional ternária
		//simplificando
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
		/* if (preco < 20.0) {
			desconto = preco * 0.1;
		}else {
			desconto = preco * 0.5;
		}

	} -> substituída 
	*/
	}

}
