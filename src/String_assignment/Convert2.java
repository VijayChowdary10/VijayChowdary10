package String_assignment;

import java.util.Scanner;

public class Convert2 {
	static char ch[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	static char ch1[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
static public char convertToCaps(char a) {
	for(int i=0; i<ch.length; i++) {
		if(a==ch[i]) {
			a=ch1[i];
			}
		}
		return a;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a sentence");
	String str=sc.nextLine();
	char str_ch[]=new char[str.length()];
	for(int i=0; i<str.length(); i++) {
		str_ch[i]=str.charAt(i);
	}
for(int i=0; i<str.length(); i++) {
		if(str_ch[i]==' ') {
			str_ch[i+1]=Convert2.convertToCaps(str_ch[i+1]);
		}
	}
	str_ch[0]=Convert2.convertToCaps(str_ch[0]);
	String temp=new String(str_ch);
	str=temp;
	System.out.println(str);
	}
}
