package java8;

import java.util.Optional;

public class Optional3 {
	public static void main(String args[]) {
		Optional<Object> objOptional = Optional.ofNullable(null);
		System.out.println(objOptional.isPresent());
		
		Optional<String> strOptional = Optional.ofNullable("One");
		System.out.println(strOptional.isPresent());
	}
}
