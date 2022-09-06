package set6;

import java.util.ArrayList;
import java.util.Iterator;

public class Usingnext {
	public static void main(String args[]) {
		ArrayList<Integer>numbers2 = new ArrayList<>();
		numbers2.add(1);
		numbers2.add(3);
		numbers2.add(2);
		System.out.println("ArrayList:" +numbers2);
		
		Iterator<Integer>Iterate2 = numbers2.iterator();
		int number = Iterate2.next();
		System.out.println("Accessed element: " +number);
		
		Iterate2.remove();
		System.out.println("Removed element: " +number);
		
		System.out.println("Updated ArrayList");
		
		while(Iterate2.hasNext()) {
			Iterate2.forEachRemaining((value)-> System.out.print(value+","));
		}
	}
}
