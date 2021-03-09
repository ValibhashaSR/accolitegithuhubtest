import java.util.*;
enum week {  
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
}
public class Enumset {  
  public static void main(String[] args) {  
    Set<week> set = EnumSet.of(week.TUESDAY, week.WEDNESDAY); 
    Iterator<week> iter = set.iterator();  
    while (iter.hasNext())  
      System.out.println(iter.next());  
    Set<week> s=EnumSet.allOf(week.class);
      System.out.println(s); 
    Set<week> s1=EnumSet.noneOf(week.class);
    System.out.println(s1);
    Set<week> s2= EnumSet.copyOf(s);
    System.out.println(s2);
  }  
} 
