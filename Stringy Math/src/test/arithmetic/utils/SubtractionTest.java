package test.arithmetic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import arithmetic.numbers.DynamicNumber;

public class SubtractionTest {

	@Test
	public void test() {
		DynamicNumber number = new DynamicNumber("100.200300400500").subtract("600700.800900");
		assertEquals(number.toString(), "-600600.600599599500");
	}

}
