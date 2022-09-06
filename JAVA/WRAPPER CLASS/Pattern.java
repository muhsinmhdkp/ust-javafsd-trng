package Set5;

class Pattern1 {
	public void display() {
		for (int i = 0;i<10;i++) {
			System.out.println("*");
		}
	}
	public void display(char symbol) {
		for (int i=0;i<10;i++) {
			System.out.println(symbol);
		}
	}
}

public class Pattern {
	public static void main (String args[]) {
		Pattern1 d1 = new Pattern1();
		d1.display();
		System.out.println("\n");
		
		d1.display('#');
	}
}
