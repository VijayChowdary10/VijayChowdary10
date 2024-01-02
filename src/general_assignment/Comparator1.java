package general_assignment;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Comparator1 {
public static void main(String[] args) {
	Comparator<String> c=(s1,s2)->{
		int l1=s1.length();
		int l2=s2.length();
		return l1>l2?+1:(l1==l2?0:-1);
	};
	Set<String> strings=new TreeSet<String>(c);
	strings.add("vijayChowdary");
	strings.add("kalyan");
	strings.add("harsh");
	strings.add("channappa");
	System.out.println(strings);
	}
}
