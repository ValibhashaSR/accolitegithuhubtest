package accolitegithuhubtest.nishu;
class Addition{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){return a+b+c;}
static double add(double a, double b){return a+b;}  
} 
public class MethodOverloading{  
public static void main(String[] args){  
System.out.println(Addition.add(10,10));  
System.out.println(Addition.add(11,11,11));  
System.out.println(Addition.add(12.3,12.6)); 
}} 
