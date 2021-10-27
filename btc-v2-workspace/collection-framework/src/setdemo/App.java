package setdemo;

import java.util.HashSet;
import java.util.Set;

public class App {

	
	public static void main(String[] args) {
		Employee emp1=new Employee(1001,"Mahesh",45000);
		Employee emp2=new Employee(1005, "Rohit", 65000);
		Employee emp3=new Employee(1002, "Arun", 55500);
		Employee emp4=new Employee(1001,"Mahesh",45000);
		
		
		Set<Employee> employees= new HashSet<Employee>();
		
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		employees.forEach(System.out::println);
		
	}
}
