package javakata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
	@Test
	public void testGetFizzBuzzWith15() {
		System.out.println("Check FizzBuzz call with: 15");
		assertEquals("fizzbuzz", FizzBuzz.getFizzBuzz(15));
		assertEquals("fizzbuzz", FizzBuzz.getFizzBuzz(30));
	}
	
	@Test
	public void testGetFizzWith3() {
		System.out.println("Check FizzBuzz call with: 3");
		assertEquals("fizz", FizzBuzz.getFizzBuzz(3));
		assertEquals("fizz", FizzBuzz.getFizzBuzz(6));
	}
	
	@Test
	public void testGetBuzzWith5() {
		System.out.println("Check FizzBuzz call with: 4");
		assertEquals("buzz", FizzBuzz.getFizzBuzz(5));
		assertEquals("buzz", FizzBuzz.getFizzBuzz(10));
	}
	
	@Test
	public void testOtherNumbers() {
		System.out.println("Check FizzBuzz call with other numbers.(1,2,4)");
		assertEquals("1", FizzBuzz.getFizzBuzz(1));
		assertEquals("2", FizzBuzz.getFizzBuzz(2));
		assertEquals("4", FizzBuzz.getFizzBuzz(4));
	}
}
