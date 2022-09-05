package set2;
class Anim4{
	Anim4() {
		System.out.println("iam in animal");
	}
}

class Dog3 extends Anim4{
	Dog3(){
		super();
		System.out.println("iam a dog");
	}
	
}
public class Animal4 {
	public static void main (String args[]) {
		Dog3 dog1 = new Dog3();
		
	}
}
