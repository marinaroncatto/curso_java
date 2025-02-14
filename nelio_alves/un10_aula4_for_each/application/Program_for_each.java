package application;

public class Program_for_each {

	public static void main(String[] args) {
		// for each
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		//criando o vetor já instanciado o conteúdo
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------");
		
		//for each
		for(String obj : vect) {
			System.out.println(obj);
		}
	}

}
