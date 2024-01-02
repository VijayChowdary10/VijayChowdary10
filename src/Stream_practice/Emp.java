package Stream_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Emp_details{
	String name;
	String id;
	String domain;
	int salary;
	public Emp_details(String name, String id, String domain, int salary) {
		this.name=name;
		this.id=id;
		this.domain=domain;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Emp_details [name=" + name + ", id=" + id + ", domain=" + domain + ", salary=" + salary + "]";
	}
  	}
  public class Emp {
	static Scanner sc=new Scanner(System.in);
	static String userin;
	void java() {
		
		ArrayList<Emp_details> java=new ArrayList<>();
		java.add(new Emp_details("vijay","mt123","java",150000));
		java.add(new Emp_details("kalyan","mt124","java",160000));
		java.add(new Emp_details("harshith","mt125","java",170000));
		java.add(new Emp_details("channppa","mt126","java",180000));
		System.out.println("Employee id's of java");
		java.stream().map(a->a.id).forEach(System.out::println);
		System.out.println("enter any one the id to view the details : ");
		userin =sc.next();
		List<Emp_details> emp_id=java.stream().filter(emp->emp.id.equals(userin)).collect(Collectors.toList());
		System.out.println(emp_id);
	}
	void python() {
		ArrayList<Emp_details> python=new ArrayList<>(Arrays.asList(new Emp_details("manasa","Mt127","python",150000)
		,new Emp_details("mastan","Mt128","python",160000)
		,new Emp_details("santharao","Mt129","python",170000)
		,new Emp_details("bharath","Mt130","python",180000)));
	
	
//	System.out.println("welcome to marolix employee page\npress 1 : java   2 : python");

	}
	public static void main(String[] args) {
	Emp n= new Emp();
	n.java();
	sc.close();
}
}
