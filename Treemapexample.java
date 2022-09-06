package set6;

import java.util.Map;
import java.util.TreeMap;

public class Treemapexample {
	public static void main (String args) {
		Map<String,Integer> values1 = new TreeMap<>();
		values1.put("Second", 2);
		values1.put("First", 1);
		System.out.println("Map using TreeMap:" +values1);
		
		values1.replace("First", 11);
		values1.replace("Second", 22);
		System.out.println("new map" +values1);
		
		int removedValue = values1.remove("First");
		System.out.println("Removed Value: "+removedValue);
	}
}
