package java8;

import java.util.ArrayList;
import java.util.List;

public class ForEach2 {
	public static void main(String args[]) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		
		System.out.println("---------------Iterating by passing lambda Expression --------------------");
		
		gamesList.forEach(games -> System.out.println(games));
	}
}
