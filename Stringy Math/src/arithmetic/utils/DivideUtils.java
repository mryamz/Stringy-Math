package arithmetic.utils;

import java.util.List;

import arithmetic.numbers.DynamicNumber;
import logical.utils.LogicalUtils;

public class DivideUtils {

	private static int decimalPointsMovedDividend;

	public static List<Character> divide(DynamicNumber dividend, DynamicNumber divisor, int iterations, StringBuilder solution) {

		if (iterations == 0) {
			decimalPointsMovedDividend = divisor.getSizeRightOfPoint() == 0 ? 1 : divisor.getSizeRightOfPoint();
		}
		dividend.getNumber().remove(Character.valueOf('.'));
		divisor.getNumber().remove(Character.valueOf('.'));

		DynamicNumber dividend_copy = new DynamicNumber(dividend);
		DynamicNumber divisor_copy = new DynamicNumber(divisor);

		DynamicNumber[] arr = divideWithRemainder(new DynamicNumber(dividend), new DynamicNumber(divisor));
		DynamicNumber quotient = arr[0];
		DynamicNumber remainder = arr[1];

		DynamicNumber intermittenStep = dividend_copy.subtract(divisor_copy.multiply(quotient));

		divisor.println(iterations);
		dividend.println(iterations);
		quotient.println(iterations);
		intermittenStep.println(iterations);

		for (char c : quotient.getNumber()) {
			solution.append(c);
		}

		if (iterations > 100 || LogicalUtils.getLogicalStatus(remainder, DynamicNumber.ZERO) == "equal") {
			DynamicNumber sol = new DynamicNumber(solution.toString());
			sol.placeDecimalPointAt(decimalPointsMovedDividend); 
			return sol.getNumber();
		} else {
			intermittenStep.getNumber().add('0');
			return divide(intermittenStep, divisor, ++iterations, solution);
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
