package com.ust;

import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.internal.verification.VerificationModeFactory;

class Mockitoexp4 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		@SuppressWarnings("unchecked")
		
		List<String> mockedList = Mockito.mock(List.class);
		mockedList.add("first-element");
		mockedList.add("second-element");
		mockedList.add("third-element");
		mockedList.add("third-element");
		mockedList.clear();
		
		verify(mockedList).add("first-element");
		verify(mockedList).add("second-element");
		verify(mockedList, VerificationModeFactory.times(2)).add("third-element");
		verify(mockedList).clear();
		
		
	}

}
