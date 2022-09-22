package java8;

interface Sayable6{
	default void say() {
		System.out.println("Hello, this is default method");
	}
	void sayMore(String msg);
}


public class Defaultmethod2 implements Sayable6 {
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	
	public static void main(String args[]) {
		Defaultmethod2 dm = new Defaultmethod2();
		dm.say();
		dm.sayMore("Work is workship");
	}
}
