package java8;

@FunctionalInterface
interface Square {
	int calculator(int x);
}

public class FunctionalInterface3 {
	public static void main(String args[]) {
		
		int a =5;
		Square s = (int x) -> x*x;
		
		int ans = s.calculator(a);
		System.out.println(ans);
	}
}
