package arithmetic.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import arithmetic.numbers.DynamicNumber;

public final class ArithmeticUtils {

	private ArithmeticUtils() {
	}

	static HashMap<String, Character> base20 = new HashMap<>();
	static HashMap<Character, String> base20_swapped = new HashMap<>();

	static {
		base20.put("0", '0');
		base20.put("1", '1');
		base20.put("2", '2');
		base20.put("3", '3');
		base20.put("4", '4');
		base20.put("5", '5');
		base20.put("6", '6');
		base20.put("7", '7');
		base20.put("8", '8');
		base20.put("9", '9');
		base20.put("10", 'A');
		base20.put("11", 'B');
		base20.put("12", 'C');
		base20.put("13", 'D');
		base20.put("14", 'E');
		base20.put("15", 'F');
		base20.put("16", 'G');
		base20.put("17", 'H');
		base20.put("18", 'I');
		base20.put("19", 'J');

		base20_swapped.put('0', "0");
		base20_swapped.put('1', "1");
		base20_swapped.put('2', "2");
		base20_swapped.put('3', "3");
		base20_swapped.put('4', "4");
		base20_swapped.put('5', "5");
		base20_swapped.put('6', "6");
		base20_swapped.put('7', "7");
		base20_swapped.put('8', "8");
		base20_swapped.put('9', "9");
		base20_swapped.put('A', "10");
		base20_swapped.put('B', "11");
		base20_swapped.put('C', "12");
		base20_swapped.put('D', "13");
		base20_swapped.put('E', "14");
		base20_swapped.put('F', "15");
		base20_swapped.put('G', "16");
		base20_swapped.put('H', "17");
		base20_swapped.put('I', "18");
		base20_swapped.put('J', "19");
	}

	@SuppressWarnings({ "unchecked" })
	public static List<Character>[] generateTargetSizes(DynamicNumber dna, DynamicNumber dnb) {
		List<Character> carryOver = new ArrayList<>();
		List<Character> numberA = dna.getNumber();
		List<Character> numberB = dnb.getNumber();

		// Make number lists carryOver, A and B the same size by inflating them
		// with zeros
		int leftAlen = dna.getSizeLeftOfPoint();
		int rightAlen = dna.getSizeRightOfPoint();

		int leftBlen = dnb.getSizeLeftOfPoint();
		int rightBlen = dnb.getSizeRightOfPoint();

		if (leftAlen > leftBlen) {
			for (int i = 0; i < leftAlen; i++) {
				carryOver.add(carryOver.size(), '0');
			}
			int numZeros = leftAlen - leftBlen;
			for (int i = 0; i < numZeros; i++) {
				numberB.add(0, '0');
			}
		} else {
			for (int i = 0; i < leftBlen; i++) {
				carryOver.add(carryOver.size(), '0');
			}
			int numZeros = leftBlen - leftAlen;
			for (int i = 0; i < numZeros; i++) {
				numberA.add(0, '0');
			}
		}

		if (rightAlen > rightBlen) {

			if (!numberB.contains('.') && numberA.contains('.')) {
				numberB.add(numberB.size(), '.');
			}

			if (!carryOver.contains('.') && (numberA.contains('.') || numberB.contains('.'))) {
				carryOver.add(carryOver.size(), '.');
			}

			for (int i = 0; i < rightAlen; i++) {
				carryOver.add(carryOver.size(), '0');
			}

			int numZeros = rightAlen - rightBlen;
			for (int i = 0; i < numZeros; i++) {
				numberB.add(numberB.size(), '0');
			}
		} else {
			if (!numberA.contains('.') && numberB.contains('.')) {
				numberA.add(numberA.size(), '.');
			}

			if (!carryOver.contains('.') && (numberA.contains('.') || numberB.contains('.'))) {
				carryOver.add(carryOver.size(), '.');
			}

			for (int i = 0; i < rightBlen; i++) {
				carryOver.add(carryOver.size(), '0');
			}

			int numZeros = rightBlen - rightAlen;
			for (int i = 0; i < numZeros; i++) {
				numberA.add(numberA.size(), '0');
			}
		}

		if (numberA.contains(Character.valueOf('-')) && numberA.indexOf(Character.valueOf('-')) != 0) {
			numberA.remove(Character.valueOf('-'));
			numberA.add(0, '-');
		}
		if (numberB.contains(Character.valueOf('-')) && numberB.indexOf(Character.valueOf('-')) != 0) {
			numberB.remove(Character.valueOf('-'));
			numberB.add(0, '-');
		}

		return new List[] { numberA, numberB, carryOver };
	}

}
