package java8;

public class MethodReference4 {
	public void printMsg() {
		System.out.println("Hello, this is instance method");
	}
	
	public static void main(String args[]) {
		Thread t2 = new Thread(new MethodReference4()::printMsg);
		t2.start();
	}
}
