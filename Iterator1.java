package set6;

import java.util.Iterator;
import java.util.TreeSet;

public class Iterator1 {
public static void amin(String args[]) {
	TreeSet <Integer> numbers1 = new TreeSet<>();
	
	numbers1.add(2);
	numbers1.add(5);
	numbers1.add(6);
	System.out.println("TreeSet:" + numbers1);
	
	Iterator<Integer>iterate1 = numbers1.iterator();
	System.out.println("TreeSet using Iterator:");
	
	while(iterate1.hasNext()) {
		System.out.println(iterate1.next());
		System.out.println(",");
	}
	
	}

}
