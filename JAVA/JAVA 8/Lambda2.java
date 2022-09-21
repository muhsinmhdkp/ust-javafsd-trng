package java8;

@FunctionalInterface
interface Drawable {
	public void draw();
}


public class Lambda2 {
	public static void main (String args[]) {
		int width = 10;
		
		Drawable d2 = () -> System.out.println("Drawing: "+width);
		d2.draw();
	}
}
