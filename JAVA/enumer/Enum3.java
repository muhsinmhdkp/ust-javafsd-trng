package enumer;
enum  Size1 {
	SMALL,MEDIUM,LARGE,EXTRALARGE
}

class Test {

	Size1 pizzaSize;
	public Test(Size1 pizzaSize) {
		this.pizzaSize = pizzaSize;
	}
	public void orderPizza() {
		switch (pizzaSize) {
		case SMALL:
			System.out.println("I ordered a medium size pizza");
			break;
		case MEDIUM:
			System.out.println("i oredered a medium size pizza");
			break;
			default:
				System.out.println("I dont know which one to order.");
				break;
		
		}
	}
}

public class Enum3{
	public static void main(String args[]) {
		Test t1 = new Test(Size1.MEDIUM);
		t1.orderPizza();
	}
}
