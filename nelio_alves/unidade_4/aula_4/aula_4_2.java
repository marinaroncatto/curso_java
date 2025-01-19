package aula_4;

public class aula_4_2 {

	public static void main(String[] args) {
		// ex bascara
		
		double delta, x1, x2;
		int a = 1, b= 10, c=6;
		
		delta = (double) Math.pow(b, 2.0) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta)) /2.0* a;
		x2 = (-b - Math.sqrt(delta)) /2.0* a;
		
		System.out.println(x1);
		System.out.println(x2);

	}

}
