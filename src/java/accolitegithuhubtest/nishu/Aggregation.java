package accolitegithuhubtest.nishu;
class Emp {  
int id;  
String name;  
Address address;  
  
public Emp(int id, String name,Address address) {  
    this.id = id;  
    this.name = name;  
    this.address=address;  
}  
  
void display(){  
System.out.println(id+" "+name);  
System.out.println(address.city+" "+address.state+" "+address.country);  
}
}

class Address {  
String city,state,country;  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
}  

public class Aggregation {
public static void main(String[] args) {  
Address address1=new Address("Ggn","Haryana","india");  
Address address2=new Address("Chd","Haryana","india");  
  
Emp e=new Emp(101,"Nishu",address1);  
Emp e2=new Emp(102,"Dhami",address2);  
      
e.display();  
e2.display();  
}  
}  

