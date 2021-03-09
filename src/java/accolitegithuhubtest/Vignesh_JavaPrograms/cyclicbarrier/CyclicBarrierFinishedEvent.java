package accolitegithuhubtest.Vignesh_JavaPrograms.cyclicbarrier;

public class CyclicBarrierFinishedEvent implements Runnable {

	@Override
	public void run() {
		System.out.println("As 3 Thread have reached common barrier point"+
	"Cyclic barrier finished event has been triggered");
		System.out.println("you can update shared variables if any");
		
	}

}
