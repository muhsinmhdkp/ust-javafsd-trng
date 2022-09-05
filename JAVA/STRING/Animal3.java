package set2;
class Anim3 {
	protected String type = "animal";
	
}

class Dog2 extends Anim3{
	public String type ="mammal";
	public void printType() {
		System.out.println("Iam a " +type);
		System.out.println("I am an " + super.type);
	}
}
public class Animal3 {
	public static void main(String args[]) {
		Dog2 dog2 = new Dog2();
		dog2.printType();
	}

}
