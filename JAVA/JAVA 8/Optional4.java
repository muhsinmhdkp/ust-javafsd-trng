package java8;

import java.util.Optional;

public class Optional4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> opt = Optional.of("one");
		System.out.println(opt.orElse("default value"));
		
		Optional<String> opt1 = Optional.empty();
		System.out.println("Default Value");

	}

}
