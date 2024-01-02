package functional_assignment;
import java.util.function.Consumer;

public class Consumer2 {
public static void main(String[] args) {
	Consumer<String> text= con->System.out.println(con+" hello");
	text.accept("hey");
}
}
