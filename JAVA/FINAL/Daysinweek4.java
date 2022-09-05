package set2;

class Final4{
	public final void display() {
		System.out.println("This is a final method ");
	}
}

public class Daysinweek4 extends Final4 {
	public final void display() {
		System.out.println("This is a final method overridden ");
	}
	public static void main (String args[]) {
		Daysinweek4 obj = new Daysinweek4();
		obj.display();
	}
}
