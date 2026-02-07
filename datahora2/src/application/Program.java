package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		//formatação
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.parse("2007-02-14");
		LocalDateTime d02 = LocalDateTime.parse("2007-02-14T11:11");
		Instant d03 = Instant.parse("2007-02-14T11:11:11Z");
		
		//Convertendo data e hora pra texto, e global para local
		LocalDateTime r1 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.of("Japan"));
		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d01 = " + fmt1.format(d01));
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d03 formatado = " + fmt3.format(d03));
		System.out.println("d03 = " + d03);
		System.out.println("r1 = " + r1.format(fmt2));
		System.out.println("r2 = " + r2.format(fmt2));
		System.out.println("r3 = " + r3.format(fmt2));
		
		System.out.println("d02 dia = " + d02.getDayOfMonth());
		System.out.println("d01 dia = " + d01.getDayOfWeek());
		
	}

}
