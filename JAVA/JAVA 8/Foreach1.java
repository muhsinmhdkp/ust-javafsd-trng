package java8;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Foreach 1.
 */
public class Foreach1 {
	/**
	 * Main.
	 *
	 * @param args the args
	 */
	public static void main(String args[]) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Fooball");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		
		System.out.println("---------------Iterating by passing lambda Expression --------------------");
		
		gamesList.forEach(games -> System.out.println(games));
	}
}
