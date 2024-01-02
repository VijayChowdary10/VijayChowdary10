package Lambda_practice;

@FunctionalInterface
interface vj{
	int add(int a,int b);
}
	public class L1 {
	 void addition(vj add) {
		System.out.println("addition method");
		
	}

	public static void main(String[] args) {
		L1 a=new L1();
		vj k =(g,h)->{
			g=g+h;
			System.out.println(g);
			return g;
		};
		a.addition(k);
		k.add(67, 45);
}
}
