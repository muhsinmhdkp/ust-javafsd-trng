package set2;
class Anim2{
	public void display() {
		System.out.println("iam in animal");
	}
}

class Dog1 extends Anim2{
	public void display() {
		System.out.println("iam a dog");
	}
	public void printMessage() {
		super.display();
	}
	
}
public class Animal2 {
	public static void main (String args[]) {
		Dog1 dog1 = new Dog1();
		dog1.printMessage();
		
	}
}
