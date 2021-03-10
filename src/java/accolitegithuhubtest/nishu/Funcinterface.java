package accolitegithuhubtest.nishu;
interface Name{
	void printname(String name);
	default void text() {
		System.out.println("Default Method");
	};
}
public class Funcinterface {
	public static void main(String[] args)
	{
		Name p=(name)->{System.out.println(name);};
		p.printname("Nishu");
		p.text();
	}
}
