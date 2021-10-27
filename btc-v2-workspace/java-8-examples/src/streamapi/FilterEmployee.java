package streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class FilterEmployee {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(1001,"Mahesh",45000);
		Employee emp2=new Employee(1005, "Rohit", 35000);
		Employee emp3=new Employee(1002, "Arun", 55500);
		Employee emp4=new Employee(1004, "Jones", 62000);
		
		List<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);
		employeeList.add(emp4);
		
//		int empId=1005;
		
		Comparator<Employee> sortById = new Comparator<Employee>() {
			
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getEmployeeId()-e2.getEmployeeId();
			}
			
		};
		
		
		
		
		//employeeList.parallelStream().filter(e -> e.getEmployeeId()==empId).forEach(e->System.out.println(e));
		
		Collections.sort(employeeList, (e1,e2)->e1.getEmployeeName().compareTo(e2.getEmployeeName()));
		
		employeeList.forEach(System.out::println);
		
		

	}

}
