package test;

import arithmetic.numbers.DynamicNumber;

public class Main {
	public static void main(String... strings) {
		DynamicNumber number = new DynamicNumber("50");
		number.divide("10").println("Final Answer");
	}
}
