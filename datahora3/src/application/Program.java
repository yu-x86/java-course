package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2026-02-02");
		LocalDateTime d02 = LocalDateTime.parse("2026-02-02T14:00");
		Instant d03 = Instant.parse("2026-02-02T14:00:00Z");
		
		LocalDate d01PastWeek = d01.minusWeeks(1);
		LocalDate d01NextWeek = d01.plusWeeks(1);
		System.out.println("d01 = " + d01);
		System.out.println("d01 past week = " + d01PastWeek);
		System.out.println("d01 next week = " + d01NextWeek);
		
		Instant d03PastDay = d03.minus(1, ChronoUnit.DAYS);
		Instant d03NextDay = d03.plus(1, ChronoUnit.DAYS);
		System.out.println("d03 past week = " + d03PastDay);
		System.out.println("d03 plus week = " + d03NextDay);
		
		Duration d1 = Duration.between(d03PastDay, d03NextDay);
		System.out.println("d1 dias = " + d1.toDays());
	}

}
