package com.ust;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Mockitoexp3 {

	@Test
	void test() {
		//fail("Not yet implemented");
		List<String> list = new ArrayList<>();
		List<String> spyOnList = spy(list);
		
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10, spyOnList.size());
		
		spyOnList.add("Kiran");
		spyOnList.add("Gk");
		System.out.println(spyOnList);
		assertEquals("Kiran", spyOnList.get(0));
		assertEquals("Gk", spyOnList.get(1));
	}

}
