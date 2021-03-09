import java.util.*;  
class Treeset{  
 public static void main(String args[]){  
	 	 TreeSet<String> set=new TreeSet<String>();  
         set.add("A");  
         set.add("B");  
         set.add("C");  
         set.add("D");  
         set.add("E");  
         System.out.println("Initial Set: "+set);  
           
         System.out.println("Reverse Set: "+set.descendingSet());  
           
         System.out.println("Head Set: "+set.headSet("C", true));  
          
         System.out.println("SubSet: "+set.subSet("A", false, "E", true));  
           
         System.out.println("TailSet: "+set.tailSet("C", false)); 
         
         TreeSet<Integer> set1=new TreeSet<Integer>();  
         set1.add(34);  
         set1.add(23);  
         set1.add(4);  
         set1.add(79);  
         set1.add(5);  
         System.out.println("Initial Set: "+set1);  
           
         System.out.println("Reverse Set: "+set1.descendingSet());  
           
         System.out.println("Head Set: "+set1.headSet(34, true));  
          
         System.out.println("SubSet: "+set1.subSet(5, false, 23, true));  
           
         System.out.println("TailSet: "+set1.tailSet(34, false));  
 }  
}
