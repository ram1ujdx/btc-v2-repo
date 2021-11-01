package dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateManipulation {

	public static void main(String[] args) {
		
		LocalDate date=LocalDate.of(1996, 10, 30);
		System.out.println(date.isLeapYear());
		
		LocalDate today= LocalDate.now();
		
		int age = today.getYear()-date.getYear();
		
		System.out.println("Age = "+age);
		
		boolean isBornAfter2000 = date.isAfter(LocalDate.of(1995, 1, 1));
		
		System.out.println(isBornAfter2000);
		long days=Duration.between(date.atStartOfDay(), today.atStartOfDay()).toDays();
		System.out.println(days);
		
		today.minusDays(1);
		
		LocalTime time=LocalTime.now();
		
		System.out.println(time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
		
	}

}
