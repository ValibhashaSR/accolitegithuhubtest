class C1 implements Runnable{
   public void run(){
      System.out.println(Thread.currentThread().getName() +" is running for Runnable Implementation");
   }
}

class C2 extends Thread{
	public void run(){  
		  for(int i=1;i<5;i++){  
		    try
		    {
		    	Thread.sleep(2000);
		    }
		    catch(Exception e)
		    {
		    	System.out.println(e);
		    }  
		    System.out.println("Executing " + Thread.currentThread().getName()+ " for value " +i + " from Thread class");  
		  }  
}
}
public class Threading{
 public static void main(String args[]){ 
	 C1 runnable=new C1();
     Thread t3 =new Thread(runnable);
     t3.start();
     Thread t4 =new Thread(runnable);
     t4.start();
	 C2 t1=new C2();  
	 C2 t2=new C2();    
	 t1.setName("thread1");
	 t2.setName("thread2");
	 t1.start();  
	 try {
		 t1.join(4000);
	 }
	 catch(Exception e)
	 {System.out.println(e);
	 }
	 t2.start(); 
//	 t1.run();
//	 t2.run();
 }  
}  

