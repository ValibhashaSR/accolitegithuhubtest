package accolitegithuhubtest.niket;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args){

        String s="12-FEB-2020";
        boolean k= Pattern.matches("[0-9]{2}(-)[A-Z]{3,4}(-)[0-9]{4}",s);
        System.out.println(k);

        String s1="Niket Jain";
        boolean k1= Pattern.matches("[a-z]{5}(\\s+)[A-z]{4}",s1.toLowerCase());
        System.out.println(k1);

    }
}
