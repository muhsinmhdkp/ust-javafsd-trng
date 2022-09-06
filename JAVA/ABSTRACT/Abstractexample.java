package set4;
abstract class Abstract1{
	int age;
	String address;
	String name;
	void display() {
		System.out.println(age+ " " +address+ " " +name);
	}
	int show() {
		return 0;
	}
	
	abstract float calculate();
	
}
public class Abstractexample extends Abstract1 {
	 float calculate() {
		 return 0f;
	 }
}
