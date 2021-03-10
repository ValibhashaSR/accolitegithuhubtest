package accolitegithuhubtest.nishu;
interface Bird{
	public void act();
}
interface Animal{
	public void act(String str);
}
interface adder{
	public int add(int a,int b);
}
public class Lambdaexpr{
	public static void main(String[] args)
	{
		//no parameter
		Bird bd= ()->{ System.out.println("Flying");};
	    bd.act();
	    //single parameter
	    Animal an=(str)->{System.out.println(str);};
	    an.act("Eating");
	    // Multiple params
	    adder ad=(a,b)->(a+b);
	    System.out.println("Addition of 5 and 10 is "+ad.add(5, 10));
	    ad=(a,b)->{
	    	System.out.println("Addition");
	    	return (a+b);
	    };
	    System.out.println(ad.add(14,23));
	}
}