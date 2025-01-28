package aula2_Strings;

public class Ex1_formatacoes {

	public static void main(String[] args) {
		// manipulando Strings
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase();
		System.out.println(original);
		System.out.println(s01 + " -- toLowerCase");
		System.out.println(" ");
		
		String s02 = original.toUpperCase();
		System.out.println(original);
		System.out.println(s02 + " -- toUpperCase");
		System.out.println(" ");
		
		String s03 = original.trim();
		//elimina espaços em branco no início e no fim
		System.out.println(original);
		System.out.println(s03+ " -- trim");
		System.out.println(" ");
		
		String s04 = original.substring(2);
		//conta a partir do segundo caracter
		System.out.println(original);
		System.out.println(s04 + "-- substring(2)");
		System.out.println(" ");
		
		String s05 = original.substring(2,9);
		System.out.println(original);
		System.out.println(s05 + " -- substring(2,9)");
		System.out.println(" ");
		
		String s06 = original.replace('a', 'X');
		System.out.println(original);
		System.out.println(s06 + " -- replace('a', 'X'");
		System.out.println(" ");
		
		String s07 = original.replace("abc", "xy");
		System.out.println(original);
		System.out.println(s07 + " -- replace(abc,xy)");
		System.out.println(" ");
		
		int i = original.indexOf("bc");
		System.out.println(original);
		System.out.println(i + " -- original.indexOf(bc)");
		System.out.println(" ");
		
		int j = original.lastIndexOf("bc");
		System.out.println(original);
		System.out.println(j + " -- original.indexOf(bc)");
		System.out.println(" ");
	}

}
