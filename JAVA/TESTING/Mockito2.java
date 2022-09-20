package junit;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Mockito2 {

	@Mock
	List<String> mockList1;
	
	@Before
	public void intitialize() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		when(mockList1.get(0)).thenReturn("muhsin");
		assertEquals("muhsin", mockList1.get(0));
	}

}
