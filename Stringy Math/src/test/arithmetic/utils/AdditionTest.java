package test.arithmetic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import arithmetic.numbers.DynamicNumber;

public class AdditionTest {

	@Test
	public void test() {
		DynamicNumber number = new DynamicNumber("100.200300400500").add("600700.800900");
		assertEquals(number.toString(), "600801.001200400500");
	}

}
