package aula6_calendar_legado;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program0106 {

	public static void main(String[] args) {
		// manipulando data com calendar
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//acrescentando 4h 
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		//retornando apenas uma parte da data
		//retornando minutos
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: "+minutes);
		
		//retornando mes
		int month = cal.get(Calendar.MONTH);
		System.out.println("Month: "+(month+1));
		//para o calendar os meses começam em zero por isso as vezes precisamos 
		//somar 1
		
	}

}
