package aula3_HoraGlobalParaLocal;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program0103 {

	public static void main(String[] args) {
		// Converter hora global para local
		
		LocalDate d1 = LocalDate.parse("2022-07-20");
		LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d3 = Instant.parse("2022-07-20T01:30:26Z");
		
	/*	for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s); // imprime todas as timezones disponíveis
		} */
		
		LocalDate r1 = LocalDate.ofInstant(d3, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d3, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d3, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d3, ZoneId.of("Portugal"));
		
		System.out.println("r1 Brasil = " + r1);
		System.out.println("r2 Portugal = " + r2);
		System.out.println("r3 Brasil = " + r3);
		System.out.println("r4 Portugal = " + r4);
		
		System.out.println("d1 dia = " + d1.getDayOfMonth());
		System.out.println("d1 mês = " + d1.getMonthValue());
		System.out.println("d1 ano = " + d1.getYear());
		System.out.println("d2 hora = " + d2.getHour());
		System.out.println("d2 minutos = " + d2.getMinute());
		

	}

}
