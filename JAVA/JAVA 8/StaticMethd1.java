package java8;

interface Sayable7{
	default void say() {
		System.out.println("Hello, this is default method");
	}
	void sayMore(String msg);
	
	static void sayLouder(String msg) {
		System.out.println(msg);
	}
}

public class StaticMethd1 implements Sayable7{
	
	public void sayMore (String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethd1 dm = new StaticMethd1();
		dm.say();
		dm.sayMore("Work is worship");
		Sayable7.sayLouder("Hellooo..");
	}

}
