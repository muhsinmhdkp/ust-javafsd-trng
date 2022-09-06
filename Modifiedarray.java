package set6;

import java.util.ArrayList;

public class Modifiedarray {
		public static void main(String args[]) {
			ArrayList<String> languages = new ArrayList<>();
			
			languages.add("java");
			languages.add("Kotlin");
			languages.add("C++");
			System.out.println("ArrayList:"+ languages);
			
			languages.set(2, "Javascript");
			System.out.println("Modified ArrayList:" +languages);
		}
		
}
