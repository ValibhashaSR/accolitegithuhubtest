package accolitegithuhubtest.Vignesh_JavaPrograms.functional_interface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CustFunctInterf {
	
	public static void main(String[] args) {
		CustFunctInterf main=new CustFunctInterf();
		main.printForm(()->System.out.println("Printing form using functional interface"));
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
	}
	
	public void printForm(FunctionalInterface f){
		f.print();
		f.printColor();
	}

}
