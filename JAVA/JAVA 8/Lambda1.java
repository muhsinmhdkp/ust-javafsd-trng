package java8;

@FunctionalInterface
interface MyInterface {
	//abstract method
	double getPiValue();
}

public class Lambda1 {
	
	public static void main(String args[]) {
		MyInterface ref;
		ref = () -> (3+5);
		System.out.println("value of pi = "+ ref.getPiValue());
	}

}
