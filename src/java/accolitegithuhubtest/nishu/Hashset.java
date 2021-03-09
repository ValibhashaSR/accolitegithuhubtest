package accolitegithuhubtest.nishu;

import java.util.*;  
public class Hashset{  
public static void main(String args[]){   
	HashSet<String> set=new HashSet<String>();  
		set.add("One");  
		set.add("Two");  
		set.add("One");  
		set.add("Three");  
		set.add("one");
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		set.remove("one");
		Iterator<String> it=set.iterator();  
		while(it.hasNext()){  
		System.out.println(it.next());  
		} 
	}  
}
