package logical.utils;

import java.util.List;

import arithmetic.numbers.DynamicNumber;
import arithmetic.utils.ArithmeticUtils;

public class LogicalUtils {

	/**
	 * Get logical status
	 * 
	 * Returns "true" if a > b Returns "false" if a < b Returns "equal" if a ==
	 * b
	 * 
	 */
	private static String getLS(char a, char b) {
		String value = "NULL";

		// a @ 0
		if (a == '0' && b == '0') {
			value = "equal";
		}

		if (a == '0' && b == '1') {
			value = "false";
		}

		if (a == '0' && b == '2') {
			value = "false";
		}

		if (a == '0' && b == '3') {
			value = "false";
		}

		if (a == '0' && b == '4') {
			value = "false";
		}

		if (a == '0' && b == '5') {
			value = "false";
		}

		if (a == '0' && b == '6') {
			value = "false";
		}

		if (a == '0' && b == '7') {
			value = "false";
		}

		if (a == '0' && b == '8') {
			value = "false";
		}

		if (a == '0' && b == '9') {
			value = "false";
		}

		// a @ 1
		if (a == '1' && b == '0') {
			value = "true";
		}

		if (a == '1' && b == '1') {
			value = "equal";
		}

		if (a == '1' && b == '2') {
			value = "false";
		}

		if (a == '1' && b == '3') {
			value = "false";
		}

		if (a == '1' && b == '4') {
			value = "false";
		}

		if (a == '1' && b == '5') {
			value = "false";
		}

		if (a == '1' && b == '6') {
			value = "false";
		}

		if (a == '1' && b == '7') {
			value = "false";
		}

		if (a == '1' && b == '8') {
			value = "false";
		}

		if (a == '1' && b == '9') {
			value = "false";
		}

		// a @ 2
		if (a == '2' && b == '0') {
			value = "true";
		}

		if (a == '2' && b == '1') {
			value = "true";
		}

		if (a == '2' && b == '2') {
			value = "equal";
		}

		if (a == '2' && b == '3') {
			value = "false";
		}

		if (a == '2' && b == '4') {
			value = "false";
		}

		if (a == '2' && b == '5') {
			value = "false";
		}

		if (a == '2' && b == '6') {
			value = "false";
		}

		if (a == '2' && b == '7') {
			value = "false";
		}

		if (a == '2' && b == '8') {
			value = "false";
		}

		if (a == '2' && b == '9') {
			value = "false";
		}

		// a @ 3
		if (a == '3' && b == '0') {
			value = "true";
		}

		if (a == '3' && b == '1') {
			value = "true";
		}

		if (a == '3' && b == '2') {
			value = "true";
		}

		if (a == '3' && b == '3') {
			value = "equal";
		}

		if (a == '3' && b == '4') {
			value = "false";
		}

		if (a == '3' && b == '5') {
			value = "false";
		}

		if (a == '3' && b == '6') {
			value = "false";
		}

		if (a == '3' && b == '7') {
			value = "false";
		}

		if (a == '3' && b == '8') {
			value = "false";
		}

		if (a == '3' && b == '9') {
			value = "false";
		}

		// a @ 4
		if (a == '4' && b == '0') {
			value = "true";
		}

		if (a == '4' && b == '1') {
			value = "true";
		}

		if (a == '4' && b == '2') {
			value = "true";
		}

		if (a == '4' && b == '3') {
			value = "true";
		}

		if (a == '4' && b == '4') {
			value = "equal";
		}

		if (a == '4' && b == '5') {
			value = "false";
		}

		if (a == '4' && b == '6') {
			value = "false";
		}

		if (a == '4' && b == '7') {
			value = "false";
		}

		if (a == '4' && b == '8') {
			value = "false";
		}

		if (a == '4' && b == '9') {
			value = "false";
		}

		// a @ 5
		if (a == '5' && b == '0') {
			value = "true";
		}

		if (a == '5' && b == '1') {
			value = "true";
		}

		if (a == '5' && b == '2') {
			value = "true";
		}

		if (a == '5' && b == '3') {
			value = "true";
		}

		if (a == '5' && b == '4') {
			value = "true";
		}

		if (a == '5' && b == '5') {
			value = "equal";
		}

		if (a == '5' && b == '6') {
			value = "false";
		}

		if (a == '5' && b == '7') {
			value = "false";
		}

		if (a == '5' && b == '8') {
			value = "false";
		}

		if (a == '5' && b == '9') {
			value = "false";
		}

		// a @ 6
		if (a == '6' && b == '0') {
			value = "true";
		}

		if (a == '6' && b == '1') {
			value = "true";
		}

		if (a == '6' && b == '2') {
			value = "true";
		}

		if (a == '6' && b == '3') {
			value = "true";
		}

		if (a == '6' && b == '4') {
			value = "true";
		}

		if (a == '6' && b == '5') {
			value = "true";
		}

		if (a == '6' && b == '6') {
			value = "equal";
		}

		if (a == '6' && b == '7') {
			value = "false";
		}

		if (a == '6' && b == '8') {
			value = "false";
		}

		if (a == '6' && b == '9') {
			value = "false";
		}

		// a @ 7
		if (a == '7' && b == '0') {
			value = "true";
		}

		if (a == '7' && b == '1') {
			value = "true";
		}

		if (a == '7' && b == '2') {
			value = "true";
		}

		if (a == '7' && b == '3') {
			value = "true";
		}

		if (a == '7' && b == '4') {
			value = "true";
		}

		if (a == '7' && b == '5') {
			value = "true";
		}

		if (a == '7' && b == '6') {
			value = "true";
		}

		if (a == '7' && b == '7') {
			value = "equal";
		}

		if (a == '7' && b == '8') {
			value = "false";
		}

		if (a == '7' && b == '9') {
			value = "false";
		}

		// a @ 8
		if (a == '8' && b == '0') {
			value = "true";
		}

		if (a == '8' && b == '1') {
			value = "true";
		}

		if (a == '8' && b == '2') {
			value = "true";
		}

		if (a == '8' && b == '3') {
			value = "true";
		}

		if (a == '8' && b == '4') {
			value = "true";
		}

		if (a == '8' && b == '5') {
			value = "true";
		}

		if (a == '8' && b == '6') {
			value = "true";
		}

		if (a == '8' && b == '7') {
			value = "true";
		}

		if (a == '8' && b == '8') {
			value = "equal";
		}

		if (a == '8' && b == '9') {
			value = "false";
		}

		// a @ 9
		if (a == '9' && b == '0') {
			value = "true";
		}

		if (a == '9' && b == '1') {
			value = "true";
		}

		if (a == '9' && b == '2') {
			value = "true";
		}

		if (a == '9' && b == '3') {
			value = "true";
		}

		if (a == '9' && b == '4') {
			value = "true";
		}

		if (a == '9' && b == '5') {
			value = "true";
		}

		if (a == '9' && b == '6') {
			value = "true";
		}

		if (a == '9' && b == '7') {
			value = "true";
		}

		if (a == '9' && b == '8') {
			value = "true";
		}

		if (a == '9' && b == '9') {
			value = "true";
		}

		if (value == "NULL") {
			System.err.println("Cannot Perform Operation with: a='" + a + "', b='" + b + "'\nThe expression \"" + a + " < or == " + b + "\" cannot be performed.\n");
			throw new IllegalArgumentException();
		}

		return value;
	}

	/**
	 * Returns "true" if dna > dnb Returns "false" if dna < b Returns "equal" if
	 * dna == dnb
	 * 
	 */
	public static String getLogicalStatus(DynamicNumber raw_dna, DynamicNumber raw_dnb) {
		DynamicNumber copyA = new DynamicNumber(raw_dna);
		DynamicNumber copyB = new DynamicNumber(raw_dnb);
		List<Character>[] lists = ArithmeticUtils.generateTargetSizes(copyA, copyB);

		List<Character> numberA = lists[0];
		List<Character> numberB = lists[1];
		
		if (numberA.size() != numberB.size())
			throw new IllegalArgumentException();

		if (numberA.indexOf('.') != numberB.indexOf('.'))
			throw new IllegalArgumentException();

		String value = "equal";


		for (int i = 0; i < numberA.size(); i++) {
			if (numberA.get(i) == '.')
				continue;
			String status = getLS(numberA.get(i), numberB.get(i));
			if (status == "true") {
				return "true";
			}

			if (status == "false")
				return "false";
		}

		return value;
	}
}
