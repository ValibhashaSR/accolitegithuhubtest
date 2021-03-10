package accolitegithuhubtest.nishu;
class XYZ{  
void eat(){System.out.println("eating");}  
}  
class D extends XYZ{  
void bark(){System.out.println("barking");}  
}  
public class SingleInheritance {
	public static void main(String args[])
	{  
		D d=new D();  
		d.bark();  
		d.eat();  
	}
}
