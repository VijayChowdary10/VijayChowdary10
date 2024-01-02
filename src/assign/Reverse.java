package assign;

import java.util.Scanner;

@FunctionalInterface
interface j{
	void v();
}

public class Reverse {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	j h=()->{
		System.out.println("Enter a word");
		String a=sc.nextLine();
		char ch[]=new char[a.length()];
		for(int i=0; i<a.length(); i++) {
			ch[i]=a.charAt(i);
		}
		System.out.println("");
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		};
	h.v();
}
}
