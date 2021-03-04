package junits;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssumptionsEx {
	
	@DisplayName("Dislay Example")
	@Test
	public void junit() {
		System.setProperty("ENV","DEV");
		assumeTrue("DEV".equals(System.getProperty("ENV")));
		//assertTrue(true);
		assertEquals(20,Calculator.add(10, 10));
		
	}

}
