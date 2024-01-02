package generics;

public class M_generics<H> {
H g(H j) {
 return j;
}

public <R> R  m1(H t){
	return (R) t;
}

public static void main(String[] args) {
	M_generics<Integer> k= new M_generics();
	System.out.println(k.g(67));
	}
}
