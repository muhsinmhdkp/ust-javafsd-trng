package java8;

import java.util.Optional;

public class Optional6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> str1 = Optional.of("ONETWOTHREE");
		Optional<String> str2 = str1.map(String::toLowerCase);
		str2.ifPresent(System.out::println);

	}

}
