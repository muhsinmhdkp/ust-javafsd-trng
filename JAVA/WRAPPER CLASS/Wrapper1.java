package Set5;

public class Wrapper1 {
	public static void main (String args[]) {
		int a =5;
		double b = 5.65;
		
		Integer  aObj = Integer.valueOf(a);
		Double bObj = Double.valueOf(b);
		
		if (aObj instanceof Integer) {
			System.out.println("An Object of integer is created");
		}
		
		if(bObj instanceof Double) {
			System.out.println("An object od Double is created");
		}
	}

}
