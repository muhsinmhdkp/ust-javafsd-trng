package set2;
class Anim1{
	public void display() {
		System.out.println("iam in animal");
	}
}

class Dog extends Anim1{
	public void display() {
		System.out.println("iam a dog");
	}
	public void printMessage() {
		display();
	}
	
}
public class Animal1 {
	public static void main (String args[]) {
		Dog dog1 = new Dog();
		dog1.printMessage();
		
	}
}
