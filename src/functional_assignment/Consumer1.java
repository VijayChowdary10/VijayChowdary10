package functional_assignment;

import java.util.function.Consumer;

public class Consumer1 {
public static void main(String[] args) {
	Consumer<Integer> add= a->System.out.println(a+4);	
	add.accept(56);
}
}
