package threads;

public class Thread10 {
	public static void main(String args[]) {
		Thread101 b = new Thread101();
		b.start();;
		synchronized(b) {
			try {
				System.out.println("Waiting for b to complete..");
				b.wait();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Total is :" + b.total);
			
		}
		
	}
}
class Thread101 extends Thread{
	int total;
	public void run () {
		synchronized(this){
			for(int i=0;i<10;i++) {
				total +=i;
			}
			notify();
		}
	}
}
