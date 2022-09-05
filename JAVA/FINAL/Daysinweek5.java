package set2;

class Final5{
	public void display() {
		System.out.println("This is a final method ");
	}
}

public class Daysinweek5 extends Final5 {
	public void display() {
		System.out.println("This is a final method overridden ");
	}
	public static void main (String args[]) {
		Daysinweek4 obj = new Daysinweek4();
		obj.display();
	}
}
