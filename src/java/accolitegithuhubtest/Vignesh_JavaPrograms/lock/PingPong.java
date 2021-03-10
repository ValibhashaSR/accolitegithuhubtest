package accolitegithuhubtest.Vignesh_JavaPrograms.lock;

public class PingPong implements Runnable{
	
	private String name;
	private Object lOCK;
	
	public PingPong(String name, Object lOCK) {
	this.name=name;
	this.lOCK=lOCK;
	}

	@Override
	public void run() {

		synchronized (lOCK) {
			//while(true) {
			for(int i=0;i<10;i++){
				System.out.println(name);
				lOCK.notify();
				try {
					Thread.sleep(2000);
					lOCK.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			//}
			}
			}
		}
		
	}


