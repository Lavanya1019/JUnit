package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(EnvExtensiom.class)
public class ExtensionTest {
	
	@Test
	public void Junit1() {
		assertTrue(StringFunctions.checkPalindrome("mom"));
		System.out.println("Inside Test");
	}

}
