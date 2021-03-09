import java.util.*;
public class Linkedhashmap{ 
	  public static void main(String[] args) {
	     // Create a HashMap
	     LinkedHashMap<Integer, String> hmap = new LinkedHashMap<Integer, String>();
	     hmap.put(1, "One");
	     hmap.put(2, "Two");
	     hmap.put(3, "Three");
	     System.out.println("HashMap contains: "+hmap);
	     System.out.println("Keys: "+hmap.keySet()); 
	     System.out.println("Values: "+hmap.values());   
	     hmap.put(1, "Four");
	     System.out.println("HashMap contains: "+hmap);
	     hmap.remove(1);
	     System.out.println("HashMap contains: "+hmap);
	  }
	}

