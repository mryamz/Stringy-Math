package arithmetic.utils;

import java.util.ArrayList;
import java.util.List;

import arithmetic.numbers.DynamicNumber;

public final class ArithmeticUtils {

	private ArithmeticUtils() {
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
