package accolitegithuhubtest.nishu;
interface message{
	void print();
}
public class Methodref {
	
	public Methodref()
	{
		System.out.println("Constructor");
	}
	public static void text()
	{
		System.out.println("Static Method reference example");
	}
	
	public void msg()
	{
		System.out.println("Instance method reference");
	}
	public static void main(String[] args)
	{
		message m =Methodref::text;
		m.print();
		m=Methodref::new;
		m.print();
		Methodref mr=new Methodref();
		m=mr::msg;
		m.print();
	}
}
