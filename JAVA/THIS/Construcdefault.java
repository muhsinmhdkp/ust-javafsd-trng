package set2;

class Test_this1{
	int val1;
	int val2;
	
	Test_this1(){
		val1 = 10;
		val2 = 20;
		
	}
	Test_this1 get() {
		return this;
	}
	void display() {
		System.out.println("val1 = " + val1 + "val2 = " +val2);
	}
}
public class Construcdefault {
	public static void main(String args[]) {
		Test_this1 object = new Test_this1();
		object.get().display();
	}
}
