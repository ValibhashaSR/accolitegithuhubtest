package accolitegithuhubtest.nishu;
import java.util.*;
public class QueueExample{  
	public static void main(String args[]){  
		PriorityQueue<String> colors=new PriorityQueue<String>();  
		colors.add("Red");  
		colors.add("Green");  
		colors.add("Blue");  
		colors.add("Black"); 
		System.out.println(colors.peek());
		while(!colors.isEmpty())
		{
			String s=colors.remove();
			System.out.println(s);
		}
	}  
}

