package accolitegithuhubtest.nishu;
interface Person{
	void printname(String name);
	default void text() {
		System.out.println("Default Method");
	};
}
public class Funcinterface {
	public static void main(String[] args)
	{
		Person p=(name)->{System.out.println(name);};
		p.printname("Nishu");
		p.text();
	}
}
