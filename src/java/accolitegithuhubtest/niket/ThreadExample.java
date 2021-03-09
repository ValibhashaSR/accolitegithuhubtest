import java.util.concurrent.TransferQueue;

//class AvaialableThread implements Runnable{
//
//    ShopperStop shopperStop;
//    AvaialableThread(ShopperStop shopperStop){
//        this.shopperStop=shopperStop;
//    }
//
//    @Override
//    public void run() {
//        synchronized (shopperStop) {
//            if (this.shopperStop.num > 0) {
//                    this.shopperStop.itemPurchased();
//            }
//            else{
//                try {
//                    System.out.println("Item sold out");
//                    shopperStop.wait();
//                    this.shopperStop.itemPurchased();
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
//
//class notifyThread implements  Runnable{
//
//    ShopperStop shopperStop;
//    notifyThread(ShopperStop shopperStop){
//        this.shopperStop=shopperStop;
//    }
//
//    @Override
//    public void run() {
//        synchronized (shopperStop) {
//            if (this.shopperStop.num <= 0) {
//                this.shopperStop.notifyUser();
//                this.shopperStop.notify();
//            }
//        }
//    }
//}

public class ThreadExample {

    public static void  main(String[] args) throws InterruptedException {
        ShopperStop shopperStop = new ShopperStop();

//        AvaialableThread avaialableThread = new AvaialableThread(shopperStop);
//        notifyThread notifyThread = new notifyThread(shopperStop);
//
//
//        Thread thread = new Thread(avaialableThread);
//        Thread thread1 = new Thread(notifyThread);
//
//        thread.start();
//        Thread.sleep(1000);
//        thread1.start();

        //Inner Classes , Lmabda Expression


            Thread thread2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (shopperStop) {
                        if (shopperStop.num > 0) {
                            shopperStop.itemPurchased();
                        } else {
                            try {
                                System.out.println("Item sold out");
                                shopperStop.wait();
                                shopperStop.itemPurchased();

                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });


            Thread thread3= new Thread(new Runnable() {
                @Override
                public void run() {
                    synchronized (shopperStop) {
                        if (shopperStop.num <= 0) {
                            shopperStop.notifyUser();
                            shopperStop.notify();
                        }
                    }
                }

            });

            thread2.start();
            Thread.sleep(1000);
            thread3.start();

    }

}
