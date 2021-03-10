package accolitegithuhubtest.nishu;
interface def{
	default void func()
	{
		System.out.println("Default method");
	}
	void abs(String str);
	static void fun()
	{
		System.out.println("Static method");
	}
}
public class Interfacemethods implements def{
	public void abs(String str) {
		System.out.println(str);
	}
	public static void main(String[] args) {
	Interfacemethods d=new Interfacemethods();
	d.func();
	d.abs("Abstract method");
	def.fun();
	}
}
