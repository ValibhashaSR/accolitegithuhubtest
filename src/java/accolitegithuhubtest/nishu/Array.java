
import java.util.*;
public class Array{  
 public static void main(String args[]){  
  ArrayList<String> colors=new ArrayList<String>();  
  colors.add("Red");
  colors.add("Blue");    
  colors.add("Grapes");
  
  for(String color:colors)    
    System.out.println(color);    
  
  Collections.sort(colors);
  colors.forEach(color->{;   
	    System.out.println(color); 
  });
  ArrayList<Integer> arr=new ArrayList<Integer>();  
  arr.add(34);
  arr.add(3);    
  arr.add(75);
  for(int i=0;i<arr.size();i++)  
  {  
   System.out.println(arr.get(i));     
  }  
  Collections.sort(arr);
  Iterator<Integer> itr=arr.iterator();  
  while(itr.hasNext()){  
  System.out.println(itr.next());  
  }  
 }  
}
