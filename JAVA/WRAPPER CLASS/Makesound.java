package Set5;


abstract class Animal{
	
	abstract void makesound();
	
	public void eat() {
		System.out.println("I can eat");
	}
}


class Dog extends Animal{
	public void makesound() {
		System.out.println("Bark Bark");
	}
}

public class Makesound {
	public static void main (String args[]) {
		Dog d1 = new Dog();
		
		d1.makesound();
		d1.eat();
	}
}
