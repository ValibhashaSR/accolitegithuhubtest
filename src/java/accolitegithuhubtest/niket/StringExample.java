package java.accolitegithuhubtest.niket;
import java.util.DoubleSummaryStatistics;
import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args){
        String s="Niket Jain";
        String s1="niket jain";
        String s2="Niket Jain";
        String s3= new String("ji");

        StringBuffer stringBuffer=new StringBuffer("Hi how are you?");

        StringTokenizer stringTokenizer= new StringTokenizer("Hi how are you?"," ");

        char sArray[]=s.toCharArray();
        char s1Array[]= s1.toCharArray();

        System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(s.equals(s2));
        System.out.println(s.toUpperCase());

        System.out.println(stringBuffer);

        stringBuffer.insert(2,",");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuffer.delete(0,1);
        System.out.println(stringBuffer);


        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }

    }
}
