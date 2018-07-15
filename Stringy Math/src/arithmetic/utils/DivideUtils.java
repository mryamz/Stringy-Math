package arithmetic.utils;

import java.util.List;

import arithmetic.numbers.DynamicNumber;
import logical.utils.LogicalUtils;

public class DivideUtils {

	private static boolean isSigned;
	private static int lengthBeforeDecimalInDividend = -1;

	public static List<Character> divide(DynamicNumber dividend, DynamicNumber divisor, DynamicNumber iterations, StringBuilder solution) {

		if (LogicalUtils.getLogicalStatus(iterations, new DynamicNumber("0")) == "equal") {
			isSigned = false;

			if (dividend.getNumber().contains('-') && divisor.getNumber().contains('-')) {
				isSigned = false;
			}

			if (dividend.getNumber().contains('-') && !divisor.getNumber().contains('-')) {
				isSigned = true;
			}

			if (!dividend.getNumber().contains('-') && divisor.getNumber().contains('-')) {
				isSigned = true;
			}
			dividend.formatNumber();
			divisor.formatNumber();
		}

		if (lengthBeforeDecimalInDividend == -1)
			lengthBeforeDecimalInDividend = dividend.getSizeLeftOfPoint();

		if (divisor.getNumber().contains('.')) {
			int lengthBeforeDecimalInDivisor = divisor.getSizeLeftOfPoint();
			divisor.getNumber().remove(Character.valueOf('.'));
			dividend.getNumber().remove(Character.valueOf('.'));

			for (int i = dividend.getNumber().size(); i < lengthBeforeDecimalInDividend + lengthBeforeDecimalInDivisor; i++) {
				dividend.getNumber().add('0');
			}
			dividend.getNumber().add(lengthBeforeDecimalInDividend + lengthBeforeDecimalInDivisor, '.');
		}

		dividend.getNumber().remove(Character.valueOf('-'));
		divisor.getNumber().remove(Character.valueOf('-'));
		dividend.getNumber().remove(Character.valueOf('.'));
		divisor.getNumber().remove(Character.valueOf('.'));

		DynamicNumber dividend_copy = new DynamicNumber(dividend);
		DynamicNumber divisor_copy = new DynamicNumber(divisor);

		DynamicNumber[] arr = divideWithRemainder(new DynamicNumber(dividend), new DynamicNumber(divisor));
		DynamicNumber quotient = arr[0];
		DynamicNumber remainder = arr[1];

		DynamicNumber intermittenStep = dividend_copy.subtract(divisor_copy.multiply(quotient));

		for (char c : quotient.getNumber()) {
			solution.append(c);
		}

		remainder.formatNumber();
		System.out.println(remainder);
		if (remainder.toString().equals("0") || LogicalUtils.getLogicalStatus(iterations, new DynamicNumber("1000")) == "true") {
			DynamicNumber sol = new DynamicNumber(solution.toString());
			if (isSigned) {
				sol.getNumber().add(0, '-');
			}

			for (int i = 0; i < lengthBeforeDecimalInDividend - 1; i++) {
				sol.getNumber().add(0, '0');
			}

			if (lengthBeforeDecimalInDividend - 1 < 0) {
				sol.getNumber().add(0, '.');
			} else {
				sol.getNumber().add(lengthBeforeDecimalInDividend - 1, '.');
			}

			sol.formatNumber();
			return sol.getNumber();
		} else {
			intermittenStep.getNumber().add('0');
			return divide(intermittenStep, divisor, iterations.add("1"), solution);
		}

	}

	/**
	 * Returns an array of DynamicNumbers.
	 * 
	 * array at [0] = quotient, whilst array at [1] = remainder
	 * 
	 */
	private static DynamicNumber[] divideWithRemainder(DynamicNumber divisor, DynamicNumber dividend) {
		DynamicNumber solution = new DynamicNumber("0");
		while (LogicalUtils.getLogicalStatus(divisor, dividend) != "false") {
			divisor.subtract(dividend);
			solution.add("1");
		}

		return new DynamicNumber[] { solution, divisor };
	}
}
