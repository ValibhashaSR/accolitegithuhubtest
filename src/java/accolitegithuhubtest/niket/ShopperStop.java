public class ShopperStop {

   public int num=0;

      public synchronized void itemPurchased(){
        this.num-=1;
        System.out.println("Item is purchased");
    }

      public synchronized void notifyUser(){
        this.num=1;
        System.out.println("Item is available for buy");
    }
}


