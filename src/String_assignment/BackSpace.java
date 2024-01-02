package String_assignment;

import java.util.Scanner;

public class BackSpace {
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("give a character which acts as a backspace");
//	char backSpaceKey=sc.next().charAt(0);
//	System.out.println("give sentence");
//	String str=sc.next();
//	char str_ch[]=new char[str.length()];
//	
//	for(int i=0; i<str.length(); i++) {
//		str_ch[i]=str.charAt(i);
//	}
//	for(int i=0; i<str.length()-1; i++) {
//		if(str_ch[i]==backSpaceKey) {
//		
//			str_ch[i]=str_ch[i+1];
//			str_ch[i-1]=str_ch[i];
//		}
//	}
//	String temp=new String(str_ch);
//	str=temp;
//	System.out.println(str);
//	}
	
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Give a character which acts as a backspace");
	        char backSpaceKey = sc.next().charAt(0);
	        
	        System.out.println("Give a sentence");
	        String str = sc.next();
	        
	        char[] str_ch = new char[str.length()];
	        
	        for (int i = 0; i < str.length(); i++) {
	            str_ch[i] = str.charAt(i);
	        }

	        for (int i = 0; i < str.length(); i++) {
	            if (str_ch[i] == backSpaceKey) {
	                // Shift characters to the left to simulate backspace
	                for (int j = i; j < str.length() - 1; j++) {
	                    str_ch[j] = str_ch[j + 1];
	                }
	                // Adjust the loop counter and length
	                i--;
	                str = str.substring(0, str.length() - 1);
	            }
	        }

	        System.out.println(str);
	    }
	}

	

