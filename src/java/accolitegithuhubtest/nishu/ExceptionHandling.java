package accolitegithuhubtest.nishu;
public class ExceptionHandling{  
  public static void main(String args[]){  
	  int a=3;
//	  int b=0;
	  int b=2;
	  try {
		  int c=a/b;
		  System.out.println(c);
	  }
	  catch(Exception e) {
		  System.out.println(e);
	  }
	  finally {
		  System.out.println("Finally Block");
	  }
  }
} 