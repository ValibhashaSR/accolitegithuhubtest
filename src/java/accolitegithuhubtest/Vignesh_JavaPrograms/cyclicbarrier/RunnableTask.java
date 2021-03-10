package accolitegithuhubtest.Vignesh_JavaPrograms.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RunnableTask implements Runnable{
	
	CyclicBarrier cyclicBarrier;
	long sleepTime;
	
	public RunnableTask(CyclicBarrier cyclicBarrier,long sleepTime) {
		this.cyclicBarrier=cyclicBarrier;
		this.sleepTime=sleepTime;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleepTime);
		System.out.println(Thread.currentThread().getName()+"/s is waiting for"+(cyclicBarrier.getParties()-cyclicBarrier.getNumberWaiting()-1)+"other threads to reach common barrier point");
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("As "+cyclicBarrier.getParties()+" thread have reached common barrier point"
		+Thread.currentThread().getName()+
		"has been release");
	}

}
