package junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Annotations {
	
	@BeforeAll
	public static void beforeall() {
		System.out.println("Before Junit");
	}
	
	@BeforeEach
	public void beforejunit() {
		System.out.println("Before Junit");
	}
	
	@Test
	public void junit() {
		System.out.println("Inside Junit");
	}
	
	@Disabled
	@Test
	public void junit2() {
		System.out.println("Inside Junit2");
	}
	
	@AfterEach
	public void afterjunit() {
		System.out.println("After Junit");
	}
	
	@AfterAll
	public static void afterjunit1() {
		System.out.println("After Junit");
	}
	
	

}
