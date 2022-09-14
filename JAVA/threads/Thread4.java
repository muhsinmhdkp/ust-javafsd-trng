package threads;

public class Thread4 implements Runnable {
	public void run() {
		System.out.println("Doing heavy processing - Start" + Thread.currentThread().getName());
		try 
		{
			Thread.sleep(1000);
			doDBProcessing();
		}
		catch (InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing - End " + Thread.currentThread().getName());
	}
	private void doDBProcessing() throws InterruptedException {
		Thread.sleep(5000);
	}
	public static void main (String args[]) {
		Runnable n = new Thread4();
		n.run();
	}
	
}
