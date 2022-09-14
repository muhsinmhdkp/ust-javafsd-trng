package threads;

public class Thread9 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: "+t.getName());
		System.out.println("is alive : "+t.isAlive());
		
	}
	public static void main (String args[]) throws Exception {
		Thread t = new Thread(new Thread9());
		t.start();
		t.join(1000);
		System.out.println("\n joining after 1000 milliseconds:\n");
		System.out.println("current thread"+t.getName());
		
		System.out.println("is alive: " +t.isAlive());
	}

}
