package lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Custom_object {
String id;
String name;
int salary;
 
public Custom_object(String id, String name, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}

@Override
public String toString() {
	return "Custom_object [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

public static void main(String[] args) {
	List<String> emp_id= Arrays.asList();
	List<Custom_object> details= Arrays.asList(
			new Custom_object("MT0006","vijay",45000),
			new Custom_object("MT0007","kalyan",47000),
			new Custom_object("MT0008","harshith",49000),
			new Custom_object("MT0009","channappa",51000)
			);
			
			emp_id=details.stream().filter(t->t.salary>48000).map((t)->t.name).collect(Collectors.toList());
			System.out.println(emp_id);
      }
}
