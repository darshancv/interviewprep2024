package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Consider I have a list of Employees. I want to find the Employee who gets second largest salary. Use Stream API to write the code
public class ExampletwoSecondlargestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employeee> employeelist = new ArrayList<>();
		 employeelist.add(new Employeee("John", 2500));
		 employeelist.add(new Employeee("Alice", 3000));
		 employeelist.add(new Employeee("Bob", 2200));
		 employeelist.add(new Employeee("Jane", 2800));
		 
		Employeee em= employeelist.stream().sorted(Comparator.comparingInt(Employeee::getSalary).reversed()).skip(1).findFirst().orElse(null);
		 System.out.println(em.getSalary());
	}

}

class Employeee{
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employeee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employeee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	
}