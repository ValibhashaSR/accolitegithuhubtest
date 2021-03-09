package accolitegithuhubtest.Vignesh_JavaPrograms.ThreadPool;

import java.util.concurrent.BlockingQueue;

public class PoolThreadRunnable implements Runnable {
	
	private BlockingQueue queue=null;
	private Thread thread=null;
	private boolean isStopped=false;
	
	public PoolThreadRunnable(BlockingQueue queue) {
		this.queue=queue;
	}

	@Override
	public void run() {
		this.thread=Thread.currentThread();
		while(!isStopped){
			try {
				Runnable runnable = (Runnable) queue.take();
				runnable.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	 public synchronized void doStop(){
	        isStopped = true;
	        //break pool thread out of dequeue() call.
	        this.thread.interrupt();
	    }

	    public synchronized boolean isStopped(){
	        return isStopped;
	    }

}
