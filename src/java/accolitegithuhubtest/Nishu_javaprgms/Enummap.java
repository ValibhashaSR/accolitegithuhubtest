import java.util.*; 
enum Days {  
	   SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}
public class Enummap {    
   public static void main(String[] args) { 
   EnumMap<Days, String> map = new EnumMap<Days, String>(Days.class);  
   map.put(Days.MONDAY, "1");  
   map.put(Days.TUESDAY, "2");  
   map.put(Days.WEDNESDAY, "3");  
   map.put(Days.THURSDAY, "4");  
   map.put(Days.FRIDAY, "5"); 
   map.put(Days.SATURDAY, "6"); 
   map.put(Days.SUNDAY, "7"); 
   System.out.println(map);
   map.remove(Days.MONDAY);
   System.out.println(map);
   }  
}  