package Set5;
interface MartialArts{
	void display();	
}

interface Boxing {
	void display();
}

interface Wushu extends MartialArts, Boxing{
	void display();
}
public class Interface3extend implements Wushu{
	public  void display() {
		System.out.println("Boxing and wushu are Martial arts");
	}
	
/**	public  void display1() {
		System.out.println("Boxing and wushu are Martial arts");
	}
	public  void display2() {
		System.out.println("Boxing and wushu are Martial arts");
	}
*/
	
	public static void main(String args[]) {
		Interface3extend i = new Interface3extend();
		i.display();

	}
}
