package aula1_instanciando;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program_0101 {

	public static void main(String[] args) {
		// tempo: agora
		
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		LocalDate d01 = LocalDate.now(); //data de agora
		System.out.println("LocalDate: "+d01);
		
		LocalDateTime d02 = LocalDateTime.now(); //agora com precisão de segundos
		System.out.println("LocalDateTime: "+d02);
		
		Instant d03 = Instant.now(); //agora no fuso horário zero - de londrez
		System.out.println("Instant: "+d03);
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println("LocalDate convertido de texto: "+d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println("LocalDateTime convertido de texto: "+d05);
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println("Instant convertido de texto Z: "+d06);
		
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println("Instant convertido de texto do horário de SP: "+d07);
		
		//convertendo data de formato personalizado
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println("Data formatada: "+d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println("Data formatada com minutos: "+d09);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		System.out.println("Data com dados isolados: "+d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println("Data com dados isolados: "+d11);
		
	}

}
