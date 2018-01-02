package test.arithmetic.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import arithmetic.numbers.DynamicNumber;

public class MultiplicationTest {

	@Test
	public void test() {
		DynamicNumber number = new DynamicNumber("1007857").multiply("-4375375373753.85");
		assertEquals(number.toString(), "-4409752698065433999.45");
	}

}
