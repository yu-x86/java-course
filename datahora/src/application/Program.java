package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
	public static void main(String[] args) {
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2026-02-14");
		LocalDateTime d05 = LocalDateTime.parse("2026-02-14T11:11:11");
		Instant d06 = Instant.parse("2026-02-14T11:11:11Z");
		Instant d07 = Instant.parse("2026-02-14T11:11:11-03:00");
		
		LocalDate d08 = LocalDate.parse("14/02/2026", fmt01);
		LocalDateTime d09 = LocalDateTime.parse("14/02/2026 01:30", fmt02);
		
		LocalDate d10 = LocalDate.of(2026, 2, 14);
		LocalDateTime d11 = LocalDateTime.of(2026, 2, 14, 1, 30);
		
		System.out.println("d01 = " + d01.toString());
		System.out.println("d02 = " + d02.toString());
		System.out.println("d02 = " + d03.toString());
		System.out.println("d04 = " + d04.toString());
		System.out.println("d05 = " + d05.toString());
		System.out.println("d06 = " + d06.toString());
		System.out.println("d07 = " + d07.toString());
		System.out.println("d08 = " + d08.toString());
		System.out.println("d09 = " + d09.toString());
		System.out.println("d10 = " + d10.toString());
		System.out.println("d11 = " + d11.toString());
	}
}
