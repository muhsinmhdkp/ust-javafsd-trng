package java8;

interface Addable1{
	int add(int a, int b);
}

public class Lambda4 {
	

	public static void main (String args[]) {
		Addable1 ad1 = (a,b) -> (a+b);
		System.out.println(ad1.add(10,20));
		
		Addable1 ad2 = (int a, int b) -> {
			return (a+b);
		};
		System.out.println(ad2.add(100,200));

	}
}
