package accolitegithuhubtest.nishu;

import java.util.*;
import java.util.Iterator;  
public class Linkedhashset{  
public static void main(String args[]){   
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
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
