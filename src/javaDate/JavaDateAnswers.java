package javaDate;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.TemporalAdjusters;

public class JavaDateAnswers {

	
	//1
	LocalDateTime myBirthday = LocalDateTime.of(1997, 6, 29, 8, 0, 0, 0);
	
	//2
	LocalDate today = LocalDate.now();
	LocalDate previousThursday = today.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));

	//3
	//ZoneOffset uses UTC time as a base and represents offsets from this time zone
	//ZoneID is an identifier for any given time zone
	
	//4
	Instant instant = Instant.now();
	ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Europe/Paris"));

	Instant instant2 = zonedDateTime.toInstant();
	
	//5
	int year = 1997;
	for(Month month : Month.values()) {
	    System.out.println(month + " has " + Year.of(year).atMonth(month).lengthOfMonth() + " days.");
	}

	//6
	LocalDate date = LocalDate.now();
	YearMonth yearMonth = YearMonth.of(date.getYear(), date.getMonth());
	for (LocalDate localDate = yearMonth.atDay(1); localDate.getMonthValue() == date.getMonthValue(); localDate = localDate.plusWeeks(1)) {
	    if(localDate.getDayOfWeek() == DayOfWeek.MONDAY) {
	        System.out.println(localDate);
	    }
	}

	//7 spooky...
	LocalDate date = LocalDate.now();
	if (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13) {
	    System.out.println("Today is Friday the 13th.");
	} else {
	    System.out.println("Today is not Friday the 13th.");
	}

}
