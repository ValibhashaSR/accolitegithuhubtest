package accolitegithuhubtest.Vignesh_JavaPrograms.ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {
	
	private BlockingQueue queueTask;
	private List<PoolThreadRunnable> threadPool=new ArrayList<>();
	private boolean isStopped=false;
	
	public ThreadPool(int noOfThreads,int noOfTasks) {
		this.queueTask=new ArrayBlockingQueue<>(noOfTasks);
		for (int i = 0; i < noOfTasks; i++) {
			PoolThreadRunnable threadRunnable=new PoolThreadRunnable(queueTask);
			threadPool.add(threadRunnable);
			
		}
	}

}
