package accolitegithuhubtest.Vignesh_JavaPrograms.Executor;

public class TaskThread extends Thread{
	
	
	public TaskThread(String name) {
		super();
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+i+"-->"+" is running");
		}
	}
	
	

}
