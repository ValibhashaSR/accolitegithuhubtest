package accolitegithuhubtest.Vignesh_JavaPrograms.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorRunner {

	public static void main(String[] args) {
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		executorService.submit(new TaskThread("Ajay"));
		
		executorService.submit(new TaskThread("Bajan"));
	}
}
