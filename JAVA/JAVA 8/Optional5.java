package java8;

import java.util.Optional;

public class Optional5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> emptyOp = Optional.empty();
		Optional<String> emptyOp1 = Optional.of("one");
		System.out.println(emptyOp.orElseGet(() -> "Optional value orElseGet"));
	}

}
