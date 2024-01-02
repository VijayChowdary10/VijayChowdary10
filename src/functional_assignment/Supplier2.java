package functional_assignment;

import java.util.Scanner;
import java.util.function.Supplier;

public class Supplier2 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a and b values to find a greater or not");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Supplier <Boolean> add= ()->a>b;
	System.out.println(add.get());
}
}
