package set2;
class Anim5{
	Anim5() {
		System.out.println("iam in animal");
	}
	
	Anim5(String type){
		System.out.println("Type : " +type);
	}
}

class Dog4 extends Anim5{
	Dog4(){
		super("Anim5");
		System.out.println("iam a dog");
	}
	
}
public class Animal5 {
	public static void main (String args[]) {
		Dog3 dog1 = new Dog3();
		
	}
}
