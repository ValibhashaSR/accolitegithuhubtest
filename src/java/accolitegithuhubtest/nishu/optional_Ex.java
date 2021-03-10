package accolitegithuhubtest.nishu;
import java.util.Optional;  
public class optional_Ex {
	public static void main(String[] args) {  
        String[] str = new String[10];        
        str[5] = "Nishu";
        Optional<String> str_5 = Optional.ofNullable(str[5]); 
        Optional<String> str_4 = Optional.ofNullable(str[4]);
        if(str_5.isPresent())
            System.out.println(str_5.get());  
        else  
            System.out.println("str[5] is not present");
        if(str_4.isPresent())
            System.out.println(str_4.get());  
        else  
            System.out.println("str[4] is not present");
        System.out.println("str[5]: "+str_5); 
        System.out.println("str[4]: "+str_4); 
        System.out.println("Filtered value str[4] with \"Dhami\": "+str_4.filter((s)->s.equals("Dhami")));
        System.out.println("Filtered value str[5] with \"Dhami\": "+str_5.filter((s)->s.equals("Dhami")));
        System.out.println("Filtered value str[5] with \"Nishu\": "+str_5.filter((s)->s.equals("Nishu")));  
	}
}
