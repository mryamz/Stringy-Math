package test;

import arithmetic.numbers.DynamicNumber;

public class Main {
	public static void main(String... strings) {

		DynamicNumber number = new DynamicNumber(".00025").multiply("500.323");
		
		
		number.println();
	}
}
