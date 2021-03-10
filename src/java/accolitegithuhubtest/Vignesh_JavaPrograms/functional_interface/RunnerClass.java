package accolitegithuhubtest.Vignesh_JavaPrograms.functional_interface;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class RunnerClass {

	public static void main(String[] args) {
		
		//What is the easiest way to print the sum of all of the numbers present in a 
		//list using Java 8
		
		List<Integer> numbers=Arrays.asList(2,4,6,8,10);
		IntSummaryStatistics summaryStatistics = numbers.stream().mapToInt((x)->x).summaryStatistics();
		double average = summaryStatistics.getAverage();
		System.out.println("Average--->"+average);
		long sum = summaryStatistics.getSum();
		System.out.println("Sum--->"+sum);
		
		//How can you print the date of the next occurring Wednesday using Java 8?
		
		LocalDate today=LocalDate.now();
		LocalDate nextWednesday=today.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
		System.out.println("Today--->"+today);
		System.out.println("Nxt Wednesday-->"+nextWednesday);
		
	}
}
