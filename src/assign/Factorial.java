package assign;

import java.util.Scanner;

@FunctionalInterface
interface Fact{
	int f();
}


public class Factorial {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	
	Fact a = ()->{
		System.out.println("enter a number");
		int userin=sc.nextInt();
	int ftl=userin;
	
	for(int i=userin; i>1; i--) {
		ftl=ftl*(i-1);
	}
	System.out.println("factorial of "+userin+" = "+ftl);
	return ftl;
	};
	a.f();
}
}
