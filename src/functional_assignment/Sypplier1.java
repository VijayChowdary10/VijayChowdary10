package functional_assignment;

import java.time.LocalTime;
import java.util.function.Supplier;

public class Sypplier1 {
public static void main(String[] args) {
	Supplier<String> Time = ()->{
		LocalTime d1=LocalTime.now();
		System.out.println(d1);
		return null;
	};
	Time.get();
}
}
