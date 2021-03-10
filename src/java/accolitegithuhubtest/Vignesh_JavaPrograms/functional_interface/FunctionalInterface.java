package accolitegithuhubtest.Vignesh_JavaPrograms.functional_interface;

import java.util.Random;

interface FunctionalInterface {

	void print();
	
	default void printColor() {
		System.out.println("Printing the color");
		Random random=new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
}
