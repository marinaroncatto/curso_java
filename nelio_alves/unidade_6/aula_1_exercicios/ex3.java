package aula_1_exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
/*Um Posto de combustíveis deseja determinar qual 
 * de seus produtos tem a preferência de seus 
 * clientes. Escreva um algoritmo para ler o tipo
 * de combustível abastecido (codificado da 
 * seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
 * 4.Fim). Caso o usuário informe um código 
 * inválido (fora da faixa de 1 a 4) deve ser 
 * solicitado um novo código (até que seja válido).
 * O programa será encerrado quando o código 
 * informado for o número 4. Deve ser escrito a
 * mensagem: "MUITO OBRIGADO" e a quantidade de 
 * clientes que abasteceram cada tipo de 
 * combustível, conforme exemplo. 
 */

		Scanner sc = new Scanner(System.in);
		
		int a = 0, g= 0, d= 0;
		int codigo = sc.nextInt();
		
		while(codigo != 4) {
			switch (codigo) {
			case 1: 
				a += +1;
				break;
			case 2:
				g += +1;
				break;
			case 3:
				d += +1;
				break;			
			}
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " +a);
		System.out.println("Gasolina: " +g);
		System.out.println("Diesel: " +d);
						
		sc.close();				
		
	}

}
