package threads;

public class Thread5 extends Thread {
	public Thread5(String name) {
		super(name);
	}
	
	public void run () {
		System.out.println("MyThread - Start" + Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("my thread - End" + Thread.currentThread().getName());
		
	}
	private void doDBProcessing() throws InterruptedException{
		Thread.sleep(5000);
	}
	public static void main(String args[]) {
		Thread5 t5 = new Thread5("muhsin");
		t5.start();
	}
}
