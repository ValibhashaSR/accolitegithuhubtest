import java.util.*;
public class Treemap{ 
  public static void main(String[] args) {
     // Create a HashMap
     TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
     tmap.put(1, "One");
     tmap.put(2, "Two");
     tmap.put(5, "Five");
     tmap.put(3, "Three");
     System.out.println("HashMap contains: "+tmap);
     tmap.put(1, "Four");
     System.out.println("HashMap contains: "+tmap);
     tmap.remove(1);
     System.out.println("HashMap contains: "+tmap);
  }
}
