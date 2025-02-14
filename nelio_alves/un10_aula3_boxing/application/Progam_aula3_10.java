package application;

public class Progam_aula3_10 {

	public static void main(String[] args) {
		// boxing e unboxing
		
		//boxing
		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);
		
		// unboxing
		
		int y = (int) obj;
		
		System.out.println(y);
	}

}
