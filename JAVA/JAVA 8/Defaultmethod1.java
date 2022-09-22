package java8;

interface TestInterface
{
	public void square(int a);
	
	default void show()
	{
		System.out.println("Default Method Executed");
	}
	
}
public class Defaultmethod1 implements TestInterface {
	
	public void square(int a) {
		System.out.println(a*a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultmethod1 d = new Defaultmethod1();
		d.square(4);
		
		d.show();
	}

}
