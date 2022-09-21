package java8;

public class FunctionalInterface2 {
	public static void main (String[] args) {
		new Thread(()->{
			System.out.println("New Thread created");
		}).start();
	}
}
