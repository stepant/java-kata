package javakata;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArraysFastTypeTest {

	int[] numbers = {1,3,5,7,8,0,1,2,3,16,99,10,4,5};
	int[] reversed = {5,4,10,99,16,3,2,1,0,8,7,5,3,1};
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testFindMaximum() {
		assertEquals(99, ArraysFastType.findMaximum(numbers));
	}
	
	@Test
	void testComputAverage() {
		assertEquals(11, ArraysFastType.computeAverage(numbers));
	}
	
	@Test
	void testCopyToAnotherArray() {
		assertNotSame(ArraysFastType.copyToAnotherArray(numbers), numbers);
		assertArrayEquals(numbers, ArraysFastType.copyToAnotherArray(numbers));
	}

	@Test
	void testReverse() {
		long startTime = System.nanoTime();
		assertEquals(true, Arrays.equals(reversed, ArraysFastType.reverse(numbers)));
		long timeElapsed = System.nanoTime() - startTime;
		
		System.out.println("Estimated time(nanoseconds) for simple reverse:" + timeElapsed);
	}
	
	@Test
	void testBetterReverse() {
		long startTime = System.nanoTime();
		assertEquals(true, Arrays.equals(reversed, ArraysFastType.reverse(numbers)));
		long timeElapsed = System.nanoTime() - startTime;
		
		System.out.println("Estimated time(nanoseconds) for better reverse:" + timeElapsed);
	}
}
