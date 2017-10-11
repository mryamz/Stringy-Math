package arithmetic.utils;

import java.util.ArrayList;
import java.util.List;

import arithmetic.numbers.DynamicNumber;
import logical.utils.LogicalUtils;

public final class SubtractUtils {

	static String sub(char a, char b) {
		String value = "NULL";

		// a @ 0
		if (a == '0' && b == '0') {
			value = "0";
		}

		if (a == '0' && b == '1') {
			value = "-1";
		}

		if (a == '0' && b == '2') {
			value = "-2";
		}

		if (a == '0' && b == '3') {
			value = "-3";
		}

		if (a == '0' && b == '4') {
			value = "-4";
		}

		if (a == '0' && b == '5') {
			value = "-5";
		}

		if (a == '0' && b == '6') {
			value = "-6";
		}

		if (a == '0' && b == '7') {
			value = "-7";
		}

		if (a == '0' && b == '8') {
			value = "-8";
		}

		if (a == '0' && b == '9') {
			value = "-9";
		}

		// a @ 1
		if (a == '1' && b == '0') {
			value = "1";
		}

		if (a == '1' && b == '1') {
			value = "0";
		}

		if (a == '1' && b == '2') {
			value = "-1";
		}

		if (a == '1' && b == '3') {
			value = "-2";
		}

		if (a == '1' && b == '4') {
			value = "-3";
		}

		if (a == '1' && b == '5') {
			value = "-4";
		}

		if (a == '1' && b == '6') {
			value = "-5";
		}

		if (a == '1' && b == '7') {
			value = "-6";
		}

		if (a == '1' && b == '8') {
			value = "-7";
		}

		if (a == '1' && b == '9') {
			value = "-8";
		}

		// a @ 2
		if (a == '2' && b == '0') {
			value = "2";
		}

		if (a == '2' && b == '1') {
			value = "1";
		}

		if (a == '2' && b == '2') {
			value = "0";
		}

		if (a == '2' && b == '3') {
			value = "-1";
		}

		if (a == '2' && b == '4') {
			value = "-2";
		}

		if (a == '2' && b == '5') {
			value = "-3";
		}

		if (a == '2' && b == '6') {
			value = "-4";
		}

		if (a == '2' && b == '7') {
			value = "-5";
		}

		if (a == '2' && b == '8') {
			value = "-6";
		}

		if (a == '2' && b == '9') {
			value = "-7";
		}

		// a @ 3
		if (a == '3' && b == '0') {
			value = "3";
		}

		if (a == '3' && b == '1') {
			value = "2";
		}

		if (a == '3' && b == '2') {
			value = "1";
		}

		if (a == '3' && b == '3') {
			value = "0";
		}

		if (a == '3' && b == '4') {
			value = "-1";
		}

		if (a == '3' && b == '5') {
			value = "-2";
		}

		if (a == '3' && b == '6') {
			value = "-3";
		}

		if (a == '3' && b == '7') {
			value = "-4";
		}

		if (a == '3' && b == '8') {
			value = "-5";
		}

		if (a == '3' && b == '9') {
			value = "-6";
		}

		// a @ 4
		if (a == '4' && b == '0') {
			value = "4";
		}

		if (a == '4' && b == '1') {
			value = "3";
		}

		if (a == '4' && b == '2') {
			value = "2";
		}

		if (a == '4' && b == '3') {
			value = "1";
		}

		if (a == '4' && b == '4') {
			value = "0";
		}

		if (a == '4' && b == '5') {
			value = "-1";
		}

		if (a == '4' && b == '6') {
			value = "-2";
		}

		if (a == '4' && b == '7') {
			value = "-3";
		}

		if (a == '4' && b == '8') {
			value = "-4";
		}

		if (a == '4' && b == '9') {
			value = "-5";
		}

		// a @ 5
		if (a == '5' && b == '0') {
			value = "5";
		}

		if (a == '5' && b == '1') {
			value = "4";
		}

		if (a == '5' && b == '2') {
			value = "3";
		}

		if (a == '5' && b == '3') {
			value = "2";
		}

		if (a == '5' && b == '4') {
			value = "1";
		}

		if (a == '5' && b == '5') {
			value = "0";
		}

		if (a == '5' && b == '6') {
			value = "-1";
		}

		if (a == '5' && b == '7') {
			value = "-2";
		}

		if (a == '5' && b == '8') {
			value = "-3";
		}

		if (a == '5' && b == '9') {
			value = "-4";
		}

		// a @ 6
		if (a == '6' && b == '0') {
			value = "6";
		}

		if (a == '6' && b == '1') {
			value = "5";
		}

		if (a == '6' && b == '2') {
			value = "4";
		}

		if (a == '6' && b == '3') {
			value = "3";
		}

		if (a == '6' && b == '4') {
			value = "2";
		}

		if (a == '6' && b == '5') {
			value = "1";
		}

		if (a == '6' && b == '6') {
			value = "0";
		}

		if (a == '6' && b == '7') {
			value = "-1";
		}

		if (a == '6' && b == '8') {
			value = "-2";
		}

		if (a == '6' && b == '9') {
			value = "-3";
		}

		// a @ 7
		if (a == '7' && b == '0') {
			value = "7";
		}

		if (a == '7' && b == '1') {
			value = "6";
		}

		if (a == '7' && b == '2') {
			value = "5";
		}

		if (a == '7' && b == '3') {
			value = "4";
		}

		if (a == '7' && b == '4') {
			value = "3";
		}

		if (a == '7' && b == '5') {
			value = "2";
		}

		if (a == '7' && b == '6') {
			value = "1";
		}

		if (a == '7' && b == '7') {
			value = "0";
		}

		if (a == '7' && b == '8') {
			value = "-1";
		}

		if (a == '7' && b == '9') {
			value = "-2";
		}

		// a @ 8
		if (a == '8' && b == '0') {
			value = "8";
		}

		if (a == '8' && b == '1') {
			value = "7";
		}

		if (a == '8' && b == '2') {
			value = "6";
		}

		if (a == '8' && b == '3') {
			value = "5";
		}

		if (a == '8' && b == '4') {
			value = "4";
		}

		if (a == '8' && b == '5') {
			value = "3";
		}

		if (a == '8' && b == '6') {
			value = "2";
		}

		if (a == '8' && b == '7') {
			value = "1";
		}

		if (a == '8' && b == '8') {
			value = "0";
		}

		if (a == '8' && b == '9') {
			value = "-1";
		}

		// a @ 9
		if (a == '9' && b == '0') {
			value = "9";
		}

		if (a == '9' && b == '1') {
			value = "8";
		}

		if (a == '9' && b == '2') {
			value = "7";
		}

		if (a == '9' && b == '3') {
			value = "6";
		}

		if (a == '9' && b == '4') {
			value = "5";
		}

		if (a == '9' && b == '5') {
			value = "4";
		}

		if (a == '9' && b == '6') {
			value = "3";
		}

		if (a == '9' && b == '7') {
			value = "2";
		}

		if (a == '9' && b == '8') {
			value = "1";
		}

		if (a == '9' && b == '9') {
			value = "0";
		}

		// a @ A
		if (a == 'A' && b == '0') {
			value = "10";
		}

		if (a == 'A' && b == '1') {
			value = "9";
		}

		if (a == 'A' && b == '2') {
			value = "8";
		}

		if (a == 'A' && b == '3') {
			value = "7";
		}

		if (a == 'A' && b == '4') {
			value = "6";
		}

		if (a == 'A' && b == '5') {
			value = "5";
		}

		if (a == 'A' && b == '6') {
			value = "4";
		}

		if (a == 'A' && b == '7') {
			value = "3";
		}

		if (a == 'A' && b == '8') {
			value = "2";
		}

		if (a == 'A' && b == '9') {
			value = "1";
		}

		// a @ B
		if (a == 'B' && b == '0') {
			value = "11";
		}

		if (a == 'B' && b == '1') {
			value = "10";
		}

		if (a == 'B' && b == '2') {
			value = "9";
		}

		if (a == 'B' && b == '3') {
			value = "8";
		}

		if (a == 'B' && b == '4') {
			value = "7";
		}

		if (a == 'B' && b == '5') {
			value = "6";
		}

		if (a == 'B' && b == '6') {
			value = "5";
		}

		if (a == 'B' && b == '7') {
			value = "4";
		}

		if (a == 'B' && b == '8') {
			value = "3";
		}

		if (a == 'B' && b == '9') {
			value = "2";
		}

		// a @ C
		if (a == 'C' && b == '0') {
			value = "12";
		}

		if (a == 'C' && b == '1') {
			value = "11";
		}

		if (a == 'C' && b == '2') {
			value = "10";
		}

		if (a == 'C' && b == '3') {
			value = "9";
		}

		if (a == 'C' && b == '4') {
			value = "8";
		}

		if (a == 'C' && b == '5') {
			value = "7";
		}

		if (a == 'C' && b == '6') {
			value = "6";
		}

		if (a == 'C' && b == '7') {
			value = "5";
		}

		if (a == 'C' && b == '8') {
			value = "4";
		}

		if (a == 'C' && b == '9') {
			value = "3";
		}

		// a @ D
		if (a == 'D' && b == '0') {
			value = "13";
		}

		if (a == 'D' && b == '1') {
			value = "12";
		}

		if (a == 'D' && b == '2') {
			value = "11";
		}

		if (a == 'D' && b == '3') {
			value = "10";
		}

		if (a == 'D' && b == '4') {
			value = "9";
		}

		if (a == 'D' && b == '5') {
			value = "8";
		}

		if (a == 'D' && b == '6') {
			value = "7";
		}

		if (a == 'D' && b == '7') {
			value = "6";
		}

		if (a == 'D' && b == '8') {
			value = "5";
		}

		if (a == 'D' && b == '9') {
			value = "4";
		}

		// a @ E
		if (a == 'E' && b == '0') {
			value = "14";
		}

		if (a == 'E' && b == '1') {
			value = "13";
		}

		if (a == 'E' && b == '2') {
			value = "12";
		}

		if (a == 'E' && b == '3') {
			value = "11";
		}

		if (a == 'E' && b == '4') {
			value = "10";
		}

		if (a == 'E' && b == '5') {
			value = "9";
		}

		if (a == 'E' && b == '6') {
			value = "8";
		}

		if (a == 'E' && b == '7') {
			value = "7";
		}

		if (a == 'E' && b == '8') {
			value = "6";
		}

		if (a == 'E' && b == '9') {
			value = "5";
		}

		// a @ F
		if (a == 'F' && b == '0') {
			value = "15";
		}

		if (a == 'F' && b == '1') {
			value = "14";
		}

		if (a == 'F' && b == '2') {
			value = "13";
		}

		if (a == 'F' && b == '3') {
			value = "12";
		}

		if (a == 'F' && b == '4') {
			value = "11";
		}

		if (a == 'F' && b == '5') {
			value = "10";
		}

		if (a == 'F' && b == '6') {
			value = "9";
		}

		if (a == 'F' && b == '7') {
			value = "8";
		}

		if (a == 'F' && b == '8') {
			value = "7";
		}

		if (a == 'F' && b == '9') {
			value = "6";
		}

		// a @ G
		if (a == 'G' && b == '0') {
			value = "16";
		}

		if (a == 'G' && b == '1') {
			value = "15";
		}

		if (a == 'G' && b == '2') {
			value = "14";
		}

		if (a == 'G' && b == '3') {
			value = "13";
		}

		if (a == 'G' && b == '4') {
			value = "12";
		}

		if (a == 'G' && b == '5') {
			value = "11";
		}

		if (a == 'G' && b == '6') {
			value = "10";
		}

		if (a == 'G' && b == '7') {
			value = "9";
		}

		if (a == 'G' && b == '8') {
			value = "8";
		}

		if (a == 'G' && b == '9') {
			value = "7";
		}

		// a @ H
		if (a == 'H' && b == '0') {
			value = "17";
		}

		if (a == 'H' && b == '1') {
			value = "16";
		}

		if (a == 'H' && b == '2') {
			value = "15";
		}

		if (a == 'H' && b == '3') {
			value = "14";
		}

		if (a == 'H' && b == '4') {
			value = "13";
		}

		if (a == 'H' && b == '5') {
			value = "12";
		}

		if (a == 'H' && b == '6') {
			value = "11";
		}

		if (a == 'H' && b == '7') {
			value = "10";
		}

		if (a == 'H' && b == '8') {
			value = "9";
		}

		if (a == 'H' && b == '9') {
			value = "8";
		}

		// a @ I
		if (a == 'I' && b == '0') {
			value = "18";
		}

		if (a == 'I' && b == '1') {
			value = "17";
		}

		if (a == 'I' && b == '2') {
			value = "16";
		}

		if (a == 'I' && b == '3') {
			value = "15";
		}

		if (a == 'I' && b == '4') {
			value = "14";
		}

		if (a == 'I' && b == '5') {
			value = "13";
		}

		if (a == 'I' && b == '6') {
			value = "12";
		}

		if (a == 'I' && b == '7') {
			value = "11";
		}

		if (a == 'I' && b == '8') {
			value = "10";
		}

		if (a == 'I' && b == '9') {
			value = "9";
		}

		// a @ J
		if (a == 'J' && b == '0') {
			value = "19";
		}

		if (a == 'J' && b == '1') {
			value = "18";
		}

		if (a == 'J' && b == '2') {
			value = "17";
		}

		if (a == 'J' && b == '3') {
			value = "16";
		}

		if (a == 'J' && b == '4') {
			value = "15";
		}

		if (a == 'J' && b == '5') {
			value = "14";
		}

		if (a == 'J' && b == '6') {
			value = "13";
		}

		if (a == 'J' && b == '7') {
			value = "12";
		}

		if (a == 'J' && b == '8') {
			value = "11";
		}

		if (a == 'J' && b == '9') {
			value = "10";
		}

		if (value == "NULL") {
			System.err.println("Cannot Perform Operation with: a='" + a + "', b='" + b + "'\nThe expression \"" + a + " minus " + b + "\" cannot be performed.\n");
		}
		return value;
	}

	public static List<Character> subtract(DynamicNumber dna, DynamicNumber dnb, char forcedSign) {

		List<Character>[] lists = ArithmeticUtils.generateTargetSizes(dna, dnb);
		List<Character> solution = new ArrayList<>();
		List<Character> numberA = lists[0];
		List<Character> numberB = lists[1];
		List<Character> carryOver = lists[2];

		// -x-y or -(x+y)
		if (numberA.contains('-') && !numberB.contains('-')) {
			numberA.remove(0);
			return AddUtils.add(new DynamicNumber(numberA), new DynamicNumber(numberB), '-');
		}

		// -x--y or -x+y -(x-y)
		if (numberA.contains('-') && numberB.contains('-')) {
			numberA.remove(0);
			numberB.remove(0);
			return subtract(new DynamicNumber(numberA), new DynamicNumber(numberB), '+');
		}

		// x--y or x+y
		if (!numberA.contains('-') && numberB.contains('-')) {
			numberB.remove(0);
			return AddUtils.add(new DynamicNumber(numberA), new DynamicNumber(numberB), '+');
		}

		String status = LogicalUtils.getLogicalStatus(dna, dnb);
		boolean isSigned = (status == "equal" ? false : status == "true" ? false : true);
		if (isSigned) {
			List<Character> buff = new ArrayList<>(numberA);
			numberA = new ArrayList<>(numberB);
			numberB = new ArrayList<>(buff);
		}

		int size = lists[2].size();
		int decimal = lists[2].indexOf('.');
		for (int i = size - 1; i > -1; i--) {
			if (i == decimal) {
				continue;
			}

			char a = numberA.get(i);
			char b = numberB.get(i);
			String result = sub(a, b);

			/*
			 * if the result is negative: - Make carry over value - Subtract one
			 * from its immediate-right-neighbor - TODO: if the
			 * immediate-right-neighbor is zero - Don't subtract one; rather set
			 * the value to nine for each zero - Then set the carry over to zero
			 */
			if (result.startsWith("-")) {
				String carryOverValue = "1" + numberA.get(i);
				char base20c = ArithmeticUtils.base20.get(carryOverValue);
				carryOver.set(i, base20c);
				char nextChar = numberA.get(i - 1);
				boolean nextCharIsDecimal = false;
				if (nextChar == '.') {
					nextChar = numberA.get(i - 2);
					nextCharIsDecimal = true;
				}

				if (nextChar == '0') {
					for (int j = i - 1; j > -1; j--) {
						char adjacentToZero = numberA.get(j);
						if (adjacentToZero == '.')
							continue;
						if (adjacentToZero == '0') {
							numberA.set(j, '9');
						} else {
							numberA.set(j, sub(numberA.get(j), '1').charAt(0));
							break;
						}
					}

				} else {
					numberA.set(nextCharIsDecimal ? i - 2 : i - 1, sub(nextChar, '1').charAt(0));
				}
			} else {
				carryOver.set(i, numberA.get(i));
			}
		}

		for (int i = size - 1; i > -1; i--) {
			if (i == decimal) {
				solution.add(0, '.');
				continue;
			}

			// add to solution -> carrOver[i] - numberB[i]
			char a = carryOver.get(i);
			char b = numberB.get(i);
			String result = sub(a, b);
			solution.add(0, result.charAt(0));
		}

		if (isSigned || forcedSign == '-') {
			solution.add(0, '-');
		}
		
		if(forcedSign == '+' && solution.contains('-'))
			solution.remove(0);
			

		return solution;
	}
}
