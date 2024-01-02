package functional_assignment;
import java.util.function.Consumer;
public class Consumer3 {
public static void main(String[] args) {
	Consumer<Boolean> t= y->System.out.println(y);
	t.accept(true);
}
}
