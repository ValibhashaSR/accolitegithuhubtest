package accolitegithuhubtest.nishu;
import java.util.*;  
public class StackExample{  
	public static void main(String args[]){  
		Stack<String> colors = new Stack<String>();  
		colors.push("Red");  
		colors.push("Green");  
		colors.push("Blue");  
		colors.push("Black"); 
		while(!colors.isEmpty())
		{
			String s=colors.pop();
			System.out.println(s);
		}
	}  
}
