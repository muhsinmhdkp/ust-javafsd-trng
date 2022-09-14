package threads;

public class Thread6 implements Runnable {
	public static void main (String [] args) {
		Thread Thread1 = new Thread("Guru 1");
		
		Thread Thread2 = new Thread("Guru 2");
		
		Thread1.start();
		Thread2.start();
		
		System.out.println("Thread name is as follows: ");
		
		System.out.println(Thread1.getName());
		System.out.println(Thread2.getName());
		
		
		
	}
	public void run() {
		
	}
}
