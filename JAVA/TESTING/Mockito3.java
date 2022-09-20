package junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class Mockito3 {
	
	@Test
	public void test() {
		List s = Mockito.spy(new ArrayList());
		s.add("vishnu");
		Mockito.verify(s).add("vishnu");
	}

}

/* @Spy
	List<String> spyList = new ArrayList<>();
	
	//fail("Not yet implemented");
		//List<String> lst = new ArrayList<>();
		
		
		//when(spyList.size()).thenReturn(5);
		spyList.add("Lizna");
		spyList.add("Glory");
		
		Mockito.verify(spyList).add("Lizna");
		//assertEquals("lizna",spyList.get(0));
	*/
