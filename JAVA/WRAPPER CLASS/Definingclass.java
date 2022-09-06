package Set5;

interface MartialArts1{
	void display();	
}

interface Boxing1 {
	void display();
}

public class Definingclass implements MartialArts1, Boxing1 {
	
	public void display() {
		System.out.println("Boxing is an Martial arts");
	}
	
	public static void main(String args[]) {
		Definingclass d = new Definingclass();
		d.display();
	}
}
