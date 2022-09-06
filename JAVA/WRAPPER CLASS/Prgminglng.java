package Set5;

interface Language{
	void getName(String name);
}

class ProgrammingLanguage implements Language{
	public void getName(String name) {
		System.out.println("programming Language:" +name);
	}
}
public class Prgminglng {
	public static void main(String args[]) {
		ProgrammingLanguage p = new ProgrammingLanguage();
		p.getName("Java");
	}
	
}
