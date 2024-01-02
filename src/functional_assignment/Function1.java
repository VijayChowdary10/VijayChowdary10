package functional_assignment;

import java.util.function.Function;

public class Function1 {
public static void main(String[] args) {
	Function <Integer, Integer> sum=add->add+add;
	System.out.println(sum.apply(45));
}
}
