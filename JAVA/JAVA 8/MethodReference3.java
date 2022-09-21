package java8;

interface Sayable2 {
	void say();
}

public class MethodReference3 {
	
	public static void saySomething() {
		System.out.println("Hello, this is static method");
	}
	
	public static void main(String args[]) {
		Sayable2 sayable = MethodReference3::saySomething;
		sayable.say();
	}	
}
