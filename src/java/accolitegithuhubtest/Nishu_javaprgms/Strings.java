
public class Strings {

	public static void main(String[] args)
	{
		String s1="Nishu";
		String s2="Nishu";
		String s3=new String("Nishu");
		/*When we create a String object "Nishu" using the new() operator, it creates a new object in heap memory. On the other hand, 
		if we create an object using String literal syntax "Nishu" will return existing object from the String pool.*/
		String s4="Dhami";
//		System.out.println("Equals()");
//		System.out.println(s1.equals(s2));  
//		System.out.println(s1.equals(s3));  
//		System.out.println(s1.equals(s4));
//		System.out.println("Using == operator");
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println("Using CompareTo()");
//		System.out.println(s1.compareTo(s2)); 
//		System.out.println(s1.compareTo(s4)); 
//		System.out.println(s4.compareTo(s1));  
//		s1=s1.concat(s4);
//		s1=s1+s4;
//		s1.concat(s4);
//		System.out.println(s1);
//		System.out.println(s1.substring(2)); 
//		System.out.println(s1.substring(0,2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		String s=" Welcome ";
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(s.length());
		s=s.trim();
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.replace('c', 'h'));
	}  
}
