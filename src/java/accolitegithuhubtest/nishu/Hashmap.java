package accolitegithuhubtest.nishu;

import java.util.*;
public class Hashmap{ 
  public static void main(String[] args) {
     // Create a HashMap
     HashMap<Integer, String> hmap = new HashMap<Integer, String>();
     hmap.put(1, "One");
     hmap.put(2, "Two");
     hmap.put(3, "Three");
     System.out.println("HashMap contains: "+hmap);
     hmap.put(1, "Four");
     System.out.println("HashMap contains: "+hmap);
     hmap.remove(1);
     System.out.println("HashMap contains: "+hmap);
  }
}
