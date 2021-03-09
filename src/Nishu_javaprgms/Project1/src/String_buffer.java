import java.util.StringTokenizer;
public class String_buffer {
	public static void main(String args[]){  
		StringBuffer s = new StringBuffer("Nishu");  
		System.out.println(s.capacity());
		s.append(" Dhami");
		System.out.println(s.capacity());
		s.append(", Have a nice day");
		System.out.println(s.capacity());
//		s.insert(3,"iii");
//		s.replace(3, 6,"sss");
//		s.delete(3, 6);
//		s.reverse();
		System.out.println(s);
		StringTokenizer st = new StringTokenizer("Have:a:nice:day");  
	     while (st.hasMoreTokens()) {  
	         System.out.println(st.nextToken(":"));  
	     }  
		}  
}
