package accolitegithuhubtest.Vignesh_JavaPrograms.lock;


import java.util.concurrent.locks.ReentrantLock;

public class ReeEntrantLock extends ReentrantLock{
	
	public static void main(String[] args) {
		ReeEntrantLock lock=new ReeEntrantLock();
		lock.lock();
		System.out.println(lock.getHoldCount());
		System.out.println(lock.isLocked());
		System.out.println(lock.isFair());
		System.out.println(lock.hasQueuedThreads());
		lock.unlock();
		System.out.println(lock.isLocked());
	}

}
