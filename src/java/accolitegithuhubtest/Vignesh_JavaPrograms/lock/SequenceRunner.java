package accolitegithuhubtest.Vignesh_JavaPrograms.lock;

public class SequenceRunner {

	public static void main(String[] args) throws InterruptedException {
		Object LOCK=new Object();
		PingPong pingPong1=new PingPong("PING",LOCK);
		Thread t1=new Thread(pingPong1);
		
		PingPong pingPong2=new PingPong("PONG",LOCK);
		Thread t2=new Thread(pingPong2);
		t1.start();
		t2.start();
		
	}
}
