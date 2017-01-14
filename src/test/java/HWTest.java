import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class HWTest {
//test
	@Test
	public void testMain() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCreateMessage() {
		HelloWorld test = new HelloWorld();
		String result = test.CreateMessage();
		assertEquals("Hello Worlds", result);
			
		//assertEquals.
		//fail("Not yet implemented");
	}

}
