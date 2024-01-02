package functional_assignment;

import java.util.function.Function;

public class Function3 {
public static void main(String[] args) {
	Function <String, String> text= t->t.concat("j");
	System.out.println(text.apply("v"));
}
}
