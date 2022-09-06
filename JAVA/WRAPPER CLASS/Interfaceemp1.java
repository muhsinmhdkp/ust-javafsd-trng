package Set5;
interface A{
	void functn();
}

interface B extends A{
	void func();
}

class C implements B{
	public void func() {
		System.out.println("This is func B");
	}
	
	public void functn() {
		System.out.println("This is func A");
	}
}
public class Interfaceemp1 {
	public static void main(String args[]) {
		C obj = new C();
		obj.func();
		obj.functn();
	}
}
