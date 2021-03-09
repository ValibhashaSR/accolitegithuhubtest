package accolitegithuhubtest.niket;
class ThreadExample1 {
    synchronized public void funcRun(String count){
        for(int i=0;i<20;i++)
        System.out.println("Thread "+count+" result is "+i);
    }
}


public class MultiThreading {

    public static  void main(String[] args) throws InterruptedException {

        ThreadExample1 threadExample11= new ThreadExample1();

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                threadExample11.funcRun("1");
            }
        });

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                threadExample11.funcRun("2");
            }
        });

        Thread thread3= new Thread(new Runnable() {
            @Override
            public void run() {
                threadExample11.funcRun("3");
            }
        });


        thread1.start();
        //thread1.join();
        thread2.start();
        //thread2.join();
        thread3.start();
    }
}
