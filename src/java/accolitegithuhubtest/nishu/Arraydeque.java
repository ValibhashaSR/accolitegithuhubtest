package accolitegithuhubtest.nishu;
import java.util.*;  
public class Arraydeque{  
	public static void main(String[] args) { 
		Deque<String> colors = new ArrayDeque<String>();  
		colors.add("Red");  
		colors.add("Blue");  
		colors.add("Green"); 
		colors.addFirst("Orange");
		colors.addLast("Black");
		for (String str : colors) {  
			System.out.println(str);  
		}  
		System.out.println(colors.getFirst());
		System.out.println(colors.getLast());
	}  
}
