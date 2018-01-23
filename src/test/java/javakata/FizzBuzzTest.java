package javakata;

import static org.junit.Assert.*;
import org.junit.Test;

public class FizzBuzzTest {
	@Test
	public void testGetFizzBuzzWith15() {
		assertEquals("fizzbuzz", FizzBuzz.getFizzBuzz(15));
		assertEquals("fizzbuzz", FizzBuzz.getFizzBuzz(30));
	}
	
	@Test
	public void testGetFizzWith3() {
		assertEquals("fizz", FizzBuzz.getFizzBuzz(3));
		assertEquals("fizz", FizzBuzz.getFizzBuzz(6));
	}
	
	@Test
	public void testGetBuzzWith5() {
		assertEquals("buzz", FizzBuzz.getFizzBuzz(5));
		assertEquals("buzz", FizzBuzz.getFizzBuzz(10));
	}
	
	@Test
	public void testOtherNumbers() {
		assertEquals("1", FizzBuzz.getFizzBuzz(1));
		assertEquals("2", FizzBuzz.getFizzBuzz(2));
		assertEquals("4", FizzBuzz.getFizzBuzz(4));
	}
}
