package junits;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AssertionsExample {
	
	@DisplayName("Dislay Example")
	@Test
	public void junit1() {
	
	String s1 = "lavanya";
	String s2 = "lavanya";
	String s3 =null;
	
	int i = 1;
	int j = 2;
	
	String[] expectedArray = {"one","two","three"};
	String[] resultArray = {"one","two","three"};
	
	assertEquals(s1,s2);
	assertNull(s3);
	assertTrue(j>i);
    
    assertArrayEquals(expectedArray,resultArray);
	}
}
	
	
	
	

