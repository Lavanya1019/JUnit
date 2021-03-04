package junits;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestEx {
	
	@TestFactory
	Collection<DynamicTest>junits(){
		return Arrays.asList(
			DynamicTest.dynamicTest("Add test",
		            () ->assertEquals(2, Calculator.add(1, 1))),
		          DynamicTest.dynamicTest("Palindrome test",
		            () -> assertTrue(StringFunctions.checkPalindrome("radar"))));
		   
			
			
		}
		
	}


