package aula2_formatacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program0102 {

	public static void main(String[] args) {
		// customizando a saída de data
		
		LocalDate d1 = LocalDate.parse("2022-07-20");
		LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d3 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
		
		
		System.out.println("d1 = "+d1.format(fmt1));
		System.out.println("d1 = "+fmt1.format(d1));// versão alternativa
		System.out.println("d2 fmt1 = "+d2.format(fmt1));
		System.out.println("d2 fmt2 = "+d2.format(fmt2));
		System.out.println("d3 Instant Z (equivalente ao fuso SP) = "+fmt3.format(d3));
		
		
		
		

	}

}
