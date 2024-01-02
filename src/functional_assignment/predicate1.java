package functional_assignment;

import java.util.Scanner;
import java.util.function.Predicate;

public class predicate1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	boolean t_f;
	int s;
	System.out.println("Enter your salary");
	Predicate<Integer> salary= pay->pay>50000;
	t_f=salary.test(sc.nextInt());
	if(t_f) {
		System.out.println("eligible to pay tax");
	}
	else 
		System.out.println("not eligible for tax");
}
}
