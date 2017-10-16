package test;

import arithmetic.numbers.DynamicNumber;

public class Main {
	public static void main(String... strings) {
		DynamicNumber number = new DynamicNumber("-1111").divide("1000");
		number.formatNumber();
		number.println();
	}
}
