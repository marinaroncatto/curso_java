package aula4_calculosComData;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program0104 {

	public static void main(String[] args) {
		// calculos com data e hora
		
		LocalDate d1 = LocalDate.parse("2022-07-20");
		LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d3 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekLocalDate = d1.minusDays(7);
		LocalDate nextWeeLocalDate = d1.plusDays(7);
		LocalDate nextYearLocalDate = d1.plusYears(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeeLocalDate = " + nextWeeLocalDate);
		System.out.println("nextYearLocalDate = " + nextYearLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d2.minusDays(7);
		LocalDateTime nextWeeLocalDateTime = d2.plusDays(7);
		LocalDateTime nextYearLocalDateTime = d2.plusYears(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeeLocalDateTime = " + nextWeeLocalDateTime);
		System.out.println("nextYearLocalDateTime = " + nextYearLocalDateTime);
		
		Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);
		
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		//Instant não é compatível com anos
		
		//Calculando duração
		
		
		//Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d1.atTime(0, 0)); //dessa forma setamos na mão o horário
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d1.atStartOfDay()); //converte para a meia noite
		Duration t2 = Duration.between(pastWeekLocalDateTime, d2);
		Duration t3 = Duration.between(pastWeekInstant, d3);
		Duration t4 = Duration.between(d3, pastWeekInstant);
		
		System.out.println("t1 dias = "+ t1.toDays());
		System.out.println("t2 dias = "+ t2.toDays());
		System.out.println("t3 dias = "+ t3.toDays());
		System.out.println("t4 dias = "+ t4.toDays());
	}

}
