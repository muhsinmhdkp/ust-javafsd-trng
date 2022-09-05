package set2;

class Thisdeft{
	int val1;
	int val2;
	
	Thisdeft(){
		this(10,20);
		System.out.println("Default constructor \n");
	}
	Thisdeft(int val1, int val2){
		
		this.val1 = val1;
		this.val2 = val2;
		System.out.println("Parameterised constructor");
		
	}		
	
}
public class Defaultconst2 {
	public static void main(String args[]) {
		Thisdeft object = new Thisdeft();
	}
}
