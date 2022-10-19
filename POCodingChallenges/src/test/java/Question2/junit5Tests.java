package Question2;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class junit5Tests {

	private static Stack<Double>stack;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Before All");
		stack=new Stack<Double>();
	}
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each");
	}
	@Test
	void testMax() {
		System.out.println("Test");
		stack.push(1.0);
		assertEquals(1.0,stack.max());		
	}
	@Test
	void test() {
		System.out.println("Test");
		assertEquals(1,stack.pop());
	}
	@AfterEach
	void afterEach() {
		System.out.println("After Each");		
	}
	@AfterAll
	static void afterAll() {
		System.out.println("After All");
	}
	
}
