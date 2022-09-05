package set2;


class This_Test{
	int val1;
	int val2;
	This_Test(int val1, int val2){
		this.val1 = val1+ val1;
		this.val2 = val2 + val2;
	}
	void display()
	{
		System.out.println("Value val1 = " + val1 + " Value val2 = " + val2);
	}
}


public class Paracons1 {
	public static void main(String args[]) {
		This_Test object = new This_Test(5,10);
		object.display();
	}

}
