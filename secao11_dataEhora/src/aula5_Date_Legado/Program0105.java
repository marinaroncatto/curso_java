package aula5_Date_Legado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program0105 {

	public static void main(String[] args) throws ParseException {
		// Sistema legado para datas - usado antes da versão 8
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); //criando variável com horário atual
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L); //criando com 0 milisegundos
		Date x4 = new Date(1000L * 60L * 60L* 5L);
		// Para criar uma data as 5h da manhã de 1970 é preciso 
		// encontrar o número equivalente em milisegundos
		// 1 segundo = 1000 milisegundos * 60 segundos = 1 minuto * 60 minutos = 1 hora * 5 para dar 5 horas
		
		
		Date y1 = sdf1.parse("25/06/2018");
		Date y2 = sdf2.parse("26/06/2018 15:42:07");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		//padrão iso formato UTC
		
		System.out.println("x1: "+x1); //formato padrão java
		System.out.println("x2: "+x2);
		System.out.println("x3: "+x3); //cria a data a partir da origem da contagem
		System.out.println("x4: "+x4);
		System.out.println("y1: "+sdf2.format(y1));
		System.out.println("y2: "+sdf2.format(y2));
		System.out.println("y3: "+sdf2.format(y3));
		System.out.println("----------------------");
		//POR PADRÃO AS DATAS SÃO IMPRESAS CONFORME A CONFIGURAÇÃO DE
		// LOCALIZAÇÃO DA MÁQUINA LOCAL
		System.out.println("y1: "+sdf3.format(y1));
		System.out.println("y2: "+sdf3.format(y2));
		System.out.println("y3: "+sdf3.format(y3));
		System.out.println("----------------------");
	}

}
