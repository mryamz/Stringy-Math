package test;

import arithmetic.numbers.DynamicNumber;

public class Main {
	public static void main(String... strings) {

		DynamicNumber number = new DynamicNumber("1.2").divide(".45");
		
		
		number.println();
	}
}
