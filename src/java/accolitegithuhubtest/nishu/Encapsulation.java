package accolitegithuhubtest.nishu;
//Encapsulation
package accolitegithuhubtest.nishu;
class Test{
	private String name; 
	
	public Test() {
		name="ABC";
	}
 	public String getName() 
	{
		return name; 
	}

  	public void setName(String newName) {
    		this.name = newName;
  	}
}
public class Encapsulation {
	public static void main(String[] args) {
    	Test myObj = new Test();
    	System.out.println(myObj.getName());
    	myObj.setName("Nishu");
//    	System.out.println(myObj.name);
    	System.out.println(myObj.getName());
	}
}
