package threads;

public class Thread7 implements Runnable {
	public void run() {
		
	}
	public static void main(String args[]) {
		System.out.println("Starts here:");
		Thread thread1 = new Thread();
		thread1.start();
		try {
			thread1.sleep(1000);;
		}
		
		catch (Exception e ) {
			e.printStackTrace();
		}
		thread1.setPriority(1);
		int priority = thread1.getPriority();
		System.out.println(priority);
		System.out.println("Thread Running ");
		
	}
}
