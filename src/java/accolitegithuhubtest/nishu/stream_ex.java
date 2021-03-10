package accolitegithuhubtest.nishu;
import java.util.*;
class Employee{
	int empid;
	String name;
	double Salary;
	public Employee(int empid, String name, double Salary) {  
        this.empid = empid;  
        this.name = name;  
        this.Salary = Salary;  
    }  
}

public class stream_ex {
	public static void main(String[] args) {  
		ArrayList<Employee> employees=new ArrayList<Employee>(); 
        employees.add(new Employee(101,"Nishu",64000.0));  
        employees.add(new Employee(102,"ABC",56400.0));    
        employees.add(new Employee(105,"XYZ",43522.50));  
        employees.add(new Employee(103,"MNO",92242.43));  
        System.out.println("Employess having salary less than 90000 are "+employees.stream().filter(emp->emp.Salary<90000.0).count());
        employees.stream().filter(emp->emp.Salary<90000.0).forEach(emp->System.out.println(emp.empid + " "+emp.name+" "+emp.Salary));
        double total = employees.stream().map(emp->emp.Salary).reduce(2000.0,(sum, Salary)->sum+Salary);   // accumulating price  
        System.out.println(total);
        System.out.println("Maximum Salary is "+ employees.stream().max((emp1, emp2)-> emp1.Salary>emp2.Salary? 1: -1).get().Salary);
        System.out.println("Minimum Salary is "+ employees.stream().max((emp1, emp2)-> emp1.Salary<emp2.Salary? 1: -1).get().Salary);
    }  
}
 