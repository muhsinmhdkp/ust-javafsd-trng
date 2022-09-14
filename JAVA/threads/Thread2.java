package threads;

public class Thread2 implements Runnable {
	public static void main(String args[]) {
		Runnable r = new Thread2();
		r.run();
	}
	
	public void run() {
		System.out.println("Implementation of runnable");
	}
}
