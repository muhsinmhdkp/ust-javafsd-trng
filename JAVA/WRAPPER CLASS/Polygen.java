package Set5;

interface Polygon1 {
	void getArea();
	default void getSides() {
		System.out.println("I can get the sides of a polygon:");
	}
}

class Rectangle1 implements Polygon1{
	public void getArea() {
		int length = 6;
		int breadth = 5;
		int area = length * breadth;
		System.out.println("The area of the rectangle is +area");
	}
	public void getSides() {
		System.out.println("I have 4 sides.");
	}
}

class Square implements Polygon1{
	public void getArea() {
		int length = 5;
		int area = length * length ;
		System.out.println("The area of the square is " + area);
	}
}
public class Polygen {
	public static void main (String args[]) {
		Rectangle1 r1 = new Rectangle1();
		r1.getArea();
		r1.getSides();
		
		Square s1 = new Square();
		s1.getArea();
		s1.getSides();
		
	}
}
