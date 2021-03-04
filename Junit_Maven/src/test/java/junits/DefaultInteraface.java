package junits;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public interface DefaultInteraface {
	
	@Test
	default void testPalindrome() {
		
		boolean flag = StringFunctions.checkPalindrome("radar");
		assertTrue(flag);
		System.out.println("Inside test Interface");
	}

}
