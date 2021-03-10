package accolitegithuhubtest.nishu;
import java.util.*;
import java.util.stream.Collectors;
class Employees{
	int empid;
	String name;
	double Salary;
	public Employees(int empid, String name, double Salary) {  
        this.empid = empid;  
        this.name = name;  
        this.Salary = Salary;  
    }  
}

public class collectors_Ex {
	public static void main(String[] args) {  
		ArrayList<Employees> employees=new ArrayList<Employees>(); 
        employees.add(new Employees(101,"Nishu",64000.0));  
        employees.add(new Employees(102,"ABC",56400.0));    
        employees.add(new Employees(105,"XYZ",43522.50));  
        employees.add(new Employees(103,"MNO",92242.43));
        //tolist
        List<Double> emplist = employees.stream().map(emp->emp.Salary).collect(Collectors.toList());
        System.out.println("Employee List: " + emplist);
        //toset
        Set<Integer> empset = employees.stream().map(emp->emp.empid).collect(Collectors.toSet());
        System.out.println("Employee Set: " + empset);
        //tomap
        Map<Integer,String> empmap = employees.stream().collect(Collectors.toMap(emp->emp.empid,emp->emp.name));
        System.out.println("Employee Map" + empmap);
        //summing
        Double totalSalary = employees.stream().collect(Collectors.summingDouble(x->x.Salary)); 
        System.out.println("Sum of Salaries: "+totalSalary);  
        //average
        Double avgSalary = employees.stream().collect(Collectors.averagingDouble(x->x.Salary)); 
        System.out.println("Avergae Salary: "+avgSalary); 
    }  
}

