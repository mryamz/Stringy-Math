package test;

import arithmetic.numbers.DynamicNumber;

public class Main {
	public static void main(String... strings) {
		DynamicNumber number = new DynamicNumber("11.1");
		number.divide("4").println("Final Answer");
	}
}
