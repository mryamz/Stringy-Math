package test;

import arithmetic.numbers.DynamicNumber;

public class Main {
	public static void main(String... strings) {
		DynamicNumber number = new DynamicNumber(".102");
		number.multiply("0.22").println();
	}
}
