package accolitegithuhubtest.nishu;
import java.util.StringJoiner;  
public class stringjoiner{
	public static void main(String[] args) {
	StringJoiner str = new StringJoiner(",");
	System.out.println("Animals: "+ str);
	System.out.println("Length: "+ str.length());
	str.add("Rat");
	str.add("Cat");
	System.out.println("Animals: "+ str);
	System.out.println("Length: "+ str.length());
	StringJoiner str2 = new StringJoiner(":","[","]");
	str2.add("Rabbit");
	str2.add("Dog");
	System.out.println("Animals: "+ str2);
	System.out.println("Length: "+ str2.length());
	System.out.println("Animals: "+ str2.merge(str));
	System.out.println("Length: "+ str2.length());
	}
}