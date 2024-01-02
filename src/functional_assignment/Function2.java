package functional_assignment;

import java.util.function.Function;

public class Function2 {
public static void main(String[] args) {
	Function <Integer, String> convert= i->i.toString();
	System.out.println(convert.apply(4567)+"45");
	}
}
