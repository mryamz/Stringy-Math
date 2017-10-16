package test;

import arithmetic.numbers.DynamicNumber;

public class Main {
	public static void main(String... strings) {
		DynamicNumber number = new DynamicNumber("5.2").multiply("9.2");
		number.formatNumber();
		number.println();
	}
}
