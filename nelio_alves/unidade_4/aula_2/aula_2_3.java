package aula_2;

public class aula_2_3 {

	public static void main(String[] args) {
		// ex4
		
		int a,b;
		double resultado;
		
		a=5;
		b=2;
		
		//resultado = a/b;
		/*quando dividimos dois numeros inteiros
		 * o programa irá truncar os resultados,
		 * mesmo que armazenemos os resultados
		 * em uma variável double. Neste caso o resultado
		 * será "2" ao invés de "2.5" */
		
		resultado = (double) a/b;
		/*para evitar esse erro, basta por
		 * o double entre parenteses antes
		 * da divisão - essa técnica é chamada 
		 * de casting*/
		
		
		System.out.println(resultado);

	}

}
