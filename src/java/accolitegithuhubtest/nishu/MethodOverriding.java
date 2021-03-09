package accolitegithuhubtest.nishu;
class Shape{
	int area() {return 0;}
}
class Square extends Shape{
	int area() {return 5*5;}
}
class Rec extends Shape{
	int area(){return 4*3; }
}
class Circle extends Shape{
	int area() {return (int)3.14*3*3;}
}
public class MethodOverriding {
	public static void main(String[] args)
	{
		Square s=new Square();
		Rec r=new Rec();
		Shape c=new Circle();
		System.out.println("Area of Square is "+s.area());  
		System.out.println("Area of Rectangle is "+r.area());  
		System.out.println("Area of Circle is "+c.area());  
	}
}
