package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//I have a list of Employee object.I want to sort the list based on the employee age. Use the Stream API and code for it


public class ExampleStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("John", 25,5000));
	        employees.add(new Employee("Alice", 30,50000));
	        employees.add(new Employee("Bob", 22,1000000));
	        employees.add(new Employee("Jane", 28,10));
		
		
		//List<Employee> sortedEmploye= employees.stream().sorted(Comparator.comparingInt(Employee::getAge)).toList();
		
		//List<Employee> sortedEmploye= employees.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName)).toList();
		
		List<Employee> salaryAns= employees.stream().filter(i -> i.getSalary() > 1000).collect(Collectors.toList());
		
		for(Employee e :salaryAns ){
			System.out.println(e.getName() +"  ---  "+e.getSalary());
		}
		
	}

}
class Employee{
	 private String name;
	    private int age;
	    private long salary;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	
		public Employee(String name, int age, long salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
	    
	    
}
