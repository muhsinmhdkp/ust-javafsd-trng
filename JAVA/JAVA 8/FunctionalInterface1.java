package java8;
@FunctionalInterface
interface Sayable{
	void say (String msg);
	int hashCode();
	String toString();
	boolean equals(Object obj);
}

public class FunctionalInterface1 implements Sayable {
	
	public void say (String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionalInterface1 fie = new FunctionalInterface1();
		fie.say("Hello here");
	}

}
