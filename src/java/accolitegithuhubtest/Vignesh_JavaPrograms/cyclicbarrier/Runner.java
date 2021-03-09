package accolitegithuhubtest.Vignesh_JavaPrograms.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Runner {
	
	public static void main(String[] args) {
		ExecutorService executors=Executors.newFixedThreadPool(3);
		CyclicBarrier cyclicBarrier=new CyclicBarrier(3, new CyclicBarrierFinishedEvent());
		
		RunnableTask task1=new RunnableTask(cyclicBarrier, 1000);
		RunnableTask task2=new RunnableTask(cyclicBarrier, 2000);
		RunnableTask task3=new RunnableTask(cyclicBarrier, 3000);
		executors.submit(task1);
		executors.submit(task2);
		executors.submit(task3);
		
		RunnableTask task4=new RunnableTask(cyclicBarrier, 4000);
		RunnableTask task5=new RunnableTask(cyclicBarrier, 5000);
		RunnableTask task6=new RunnableTask(cyclicBarrier, 6000);
		
		executors.submit(task4);
		executors.submit(task5);
		executors.submit(task6);
		
		
		executors.shutdown();

	}
	

}
