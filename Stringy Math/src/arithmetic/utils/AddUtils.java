package arithmetic.utils;

import java.util.ArrayList;
import java.util.List;

import arithmetic.numbers.DynamicNumber;

public final class AddUtils {

	protected static String add(char a, char b) {
		String value = "NULL";

		// a @ 0
		if (a == '0' && b == '0') {
			value = "0";
		}

		if (a == '0' && b == '1') {
			value = "1";
		}

		if (a == '0' && b == '2') {
			value = "2";
		}

		if (a == '0' && b == '3') {
			value = "3";
		}

		if (a == '0' && b == '4') {
			value = "4";
		}

		if (a == '0' && b == '5') {
			value = "5";
		}

		if (a == '0' && b == '6') {
			value = "6";
		}

		if (a == '0' && b == '7') {
			value = "7";
		}

		if (a == '0' && b == '8') {
			value = "8";
		}

		if (a == '0' && b == '9') {
			value = "9";
		}

		// a @ 1
		if (a == '1' && b == '0') {
			value = "1";
		}

		if (a == '1' && b == '1') {
			value = "2";
		}

		if (a == '1' && b == '2') {
			value = "3";
		}

		if (a == '1' && b == '3') {
			value = "4";
		}

		if (a == '1' && b == '4') {
			value = "5";
		}

		if (a == '1' && b == '5') {
			value = "6";
		}

		if (a == '1' && b == '6') {
			value = "7";
		}

		if (a == '1' && b == '7') {
			value = "8";
		}

		if (a == '1' && b == '8') {
			value = "9";
		}

		if (a == '1' && b == '9') {
			value = "10";
		}

		// a @ 2
		if (a == '2' && b == '0') {
			value = "2";
		}

		if (a == '2' && b == '1') {
			value = "3";
		}

		if (a == '2' && b == '2') {
			value = "4";
		}

		if (a == '2' && b == '3') {
			value = "5";
		}

		if (a == '2' && b == '4') {
			value = "6";
		}

		if (a == '2' && b == '5') {
			value = "7";
		}

		if (a == '2' && b == '6') {
			value = "8";
		}

		if (a == '2' && b == '7') {
			value = "9";
		}

		if (a == '2' && b == '8') {
			value = "10";
		}

		if (a == '2' && b == '9') {
			value = "11";
		}

		// a @ 3
		if (a == '3' && b == '0') {
			value = "3";
		}

		if (a == '3' && b == '1') {
			value = "4";
		}

		if (a == '3' && b == '2') {
			value = "5";
		}

		if (a == '3' && b == '3') {
			value = "6";
		}

		if (a == '3' && b == '4') {
			value = "7";
		}

		if (a == '3' && b == '5') {
			value = "8";
		}

		if (a == '3' && b == '6') {
			value = "9";
		}

		if (a == '3' && b == '7') {
			value = "10";
		}

		if (a == '3' && b == '8') {
			value = "11";
		}

		if (a == '3' && b == '9') {
			value = "12";
		}

		// a @ 4
		if (a == '4' && b == '0') {
			value = "4";
		}

		if (a == '4' && b == '1') {
			value = "5";
		}

		if (a == '4' && b == '2') {
			value = "6";
		}

		if (a == '4' && b == '3') {
			value = "7";
		}

		if (a == '4' && b == '4') {
			value = "8";
		}

		if (a == '4' && b == '5') {
			value = "9";
		}

		if (a == '4' && b == '6') {
			value = "10";
		}

		if (a == '4' && b == '7') {
			value = "11";
		}

		if (a == '4' && b == '8') {
			value = "12";
		}

		if (a == '4' && b == '9') {
			value = "13";
		}

		// a @ 5
		if (a == '5' && b == '0') {
			value = "5";
		}

		if (a == '5' && b == '1') {
			value = "6";
		}

		if (a == '5' && b == '2') {
			value = "7";
		}

		if (a == '5' && b == '3') {
			value = "8";
		}

		if (a == '5' && b == '4') {
			value = "9";
		}

		if (a == '5' && b == '5') {
			value = "10";
		}

		if (a == '5' && b == '6') {
			value = "11";
		}

		if (a == '5' && b == '7') {
			value = "12";
		}

		if (a == '5' && b == '8') {
			value = "13";
		}

		if (a == '5' && b == '9') {
			value = "14";
		}

		// a @ 6
		if (a == '6' && b == '0') {
			value = "6";
		}

		if (a == '6' && b == '1') {
			value = "7";
		}

		if (a == '6' && b == '2') {
			value = "8";
		}

		if (a == '6' && b == '3') {
			value = "9";
		}

		if (a == '6' && b == '4') {
			value = "10";
		}

		if (a == '6' && b == '5') {
			value = "11";
		}

		if (a == '6' && b == '6') {
			value = "12";
		}

		if (a == '6' && b == '7') {
			value = "13";
		}

		if (a == '6' && b == '8') {
			value = "14";
		}

		if (a == '6' && b == '9') {
			value = "15";
		}

		// a @ 7
		if (a == '7' && b == '0') {
			value = "7";
		}

		if (a == '7' && b == '1') {
			value = "8";
		}

		if (a == '7' && b == '2') {
			value = "9";
		}

		if (a == '7' && b == '3') {
			value = "10";
		}

		if (a == '7' && b == '4') {
			value = "11";
		}

		if (a == '7' && b == '5') {
			value = "12";
		}

		if (a == '7' && b == '6') {
			value = "13";
		}

		if (a == '7' && b == '7') {
			value = "14";
		}

		if (a == '7' && b == '8') {
			value = "15";
		}

		if (a == '7' && b == '9') {
			value = "16";
		}

		// a @ 8
		if (a == '8' && b == '0') {
			value = "8";
		}

		if (a == '8' && b == '1') {
			value = "9";
		}

		if (a == '8' && b == '2') {
			value = "10";
		}

		if (a == '8' && b == '3') {
			value = "11";
		}

		if (a == '8' && b == '4') {
			value = "12";
		}

		if (a == '8' && b == '5') {
			value = "13";
		}

		if (a == '8' && b == '6') {
			value = "14";
		}

		if (a == '8' && b == '7') {
			value = "15";
		}

		if (a == '8' && b == '8') {
			value = "16";
		}

		if (a == '8' && b == '9') {
			value = "17";
		}

		// a @ 9
		if (a == '9' && b == '0') {
			value = "9";
		}

		if (a == '9' && b == '1') {
			value = "10";
		}

		if (a == '9' && b == '2') {
			value = "11";
		}

		if (a == '9' && b == '3') {
			value = "12";
		}

		if (a == '9' && b == '4') {
			value = "13";
		}

		if (a == '9' && b == '5') {
			value = "14";
		}

		if (a == '9' && b == '6') {
			value = "15";
		}

		if (a == '9' && b == '7') {
			value = "16";
		}

		if (a == '9' && b == '8') {
			value = "17";
		}

		if (a == '9' && b == '9') {
			value = "18";
		}

		if (value == "NULL") {
			System.err.println("Cannot Perform Operation with: a='" + a + "', b='" + b + "'\nThe expression \"" + a + " plus " + b + "\" cannot be performed.\n");
		}

		return value;
	}

	public static List<Character> add(DynamicNumber dna, DynamicNumber dnb, char forcedSign) {

		// 1.) initialize data
		List<Character>[] lists = ArithmeticUtils.generateTargetSizes(dna, dnb);

		List<Character> solution = new ArrayList<>();
		List<Character> numberA = lists[0];
		List<Character> numberB = lists[1];
		List<Character> carryOver = lists[2];
		
		// -x + -y or -(x+y)
		if (numberA.contains('-') && numberB.contains('-')) {
			numberA.remove(0);
			numberB.remove(0);
			return AddUtils.add(new DynamicNumber(numberA), new DynamicNumber(numberB), '-');
		}

		// x + -y or x - y
		if (!numberA.contains('-') && numberB.contains('-')) {
			numberB.remove(0);
			return SubtractUtils.subtract(new DynamicNumber(numberA), new DynamicNumber(numberB), '\0');
		}

		// -x + y or y - x
		if (numberA.contains('-') && !numberB.contains('-')) {
			numberA.remove(0);
			return SubtractUtils.subtract(new DynamicNumber(numberA), new DynamicNumber(numberB), '+');
		}

		// 2.) Calculate carryOver matrix
		int decimalIndex = carryOver.indexOf('.');
		int size = carryOver.size();
		boolean expandLeftBy1 = false;
		for (int i = 0; i < size; i++) {
			if (i == decimalIndex)
				continue;

			String sum = add(numberA.get(i), numberB.get(i));
			if (sum.length() == 1) {
				solution.add(sum.charAt(0));
			}

			if (sum.length() == 2) {
				solution.add(sum.charAt(sum.length() - 1));

				if (i - 1 < 0) {
					expandLeftBy1 = true;

				} else {
					if (i - 1 == decimalIndex) {
						carryOver.set(i - 2, sum.charAt(0));
					} else {
						carryOver.set(i - 1, sum.charAt(0));
					}
				}
			}
		}

		if (carryOver.contains('.')) {
			solution.add(decimalIndex, '.');
		}

		if (expandLeftBy1) {
			carryOver.add(0, '1');
		}

		boolean shouldRecall = false;
		for (char character : carryOver) {
			if (character == '1') {
				shouldRecall = true;
			}
		}

		if (shouldRecall) {
			DynamicNumber num1 = new DynamicNumber(solution);
			DynamicNumber num2 = new DynamicNumber(carryOver);

			return add(num1, num2, forcedSign);
		} else {
			if (forcedSign == '-') {
				solution.add(0, '-');
			}
			return solution;
		}
	}
}
