package accolitegithuhubtest.nishu;
import java.util.*;  
public class Linkedlist{  
	public static void main(String args[]){  
		LinkedList<String> ll=new LinkedList<String>();  
		ll.add("ABC");  
		ll.add("XYZ");  
		ll.add("MNO");   
		Iterator<String> itr=ll.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}  
}  