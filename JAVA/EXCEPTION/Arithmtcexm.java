package set3;

public class Arithmtcexm {
	public static void main(String args[]) {
		
		try {
			int divideByZero = 5/0;
			System.out.println("Rest of code in try block");
		}
		
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exdeption=>"  +e.getMessage());
		}
		
		finally {
			System.out.println("This is the finally block");
		}
	}
}
