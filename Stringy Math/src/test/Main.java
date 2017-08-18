package test;

import arithmetic.numbers.DynamicNumber;
import logical.utils.LogicalUtils;

public class Main {
	public static void main(String... strings) {
		DynamicNumber number = new DynamicNumber("53656.15452").subtract("-9.45587000000512").add("358.2").subtract("-8.1");

		DynamicNumber max = new DynamicNumber("10");
		DynamicNumber index = new DynamicNumber("0");

		/**
		 * while(index < max) {
		 * 	number -= .001500000000040901;
		 *  index++;
		 * }
		 */
		while (LogicalUtils.getLogicalStatus(index, max) == "false") {
			number.subtract(".001500000000040901");
			index.add("1");
			index.println();
		}
		number.println();
	}
}
