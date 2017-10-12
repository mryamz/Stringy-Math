package arithmetic.utils;

import java.util.List;

import arithmetic.numbers.DynamicNumber;
import logical.utils.LogicalUtils;

public class DivideUtils {

	public static List<Character> divide(DynamicNumber dna, DynamicNumber dnb) {
		DynamicNumber[] arr = divideInt(new DynamicNumber(dna), new DynamicNumber(dnb));

		DynamicNumber quotient = arr[0];
		DynamicNumber remainder = arr[1];

		if (LogicalUtils.getLogicalStatus(remainder, new DynamicNumber("0")) == "equal") {
			return quotient.getNumber();
		} else {
			return longDivide(dnb, dna, new DynamicNumber("0"), 1).getNumber();
		}
	}

	private static DynamicNumber longDivide(DynamicNumber divisor, DynamicNumber dividend, DynamicNumber quotient_progress, int step) {
		System.out.println("____________ step " + step +" _______________");

		DynamicNumber[] arr = divideInt(new DynamicNumber(dividend), new DynamicNumber(divisor));
		DynamicNumber quotient = arr[0];
		quotient_progress.getNumber().add(quotient.getNumber().get(0));
		DynamicNumber quotient_copy = new DynamicNumber(quotient);
		DynamicNumber dividend_integer = new DynamicNumber(dividend);
		for (int i = dividend_integer.getOrigin() + dividend_integer.getSizeRightOfPoint(); i > dividend_integer.getSizeRightOfPoint(); i--) {
			dividend_integer.getNumber().remove(i);
		}
		dividend_integer.calculateSizes();
		dividend_integer.println("dividend_integer");
		DynamicNumber remainder = arr[1];
		remainder.println("remainder");

		divisor.println("divisor");
		dividend.println("dividend");
		quotient.println("quotient");

		DynamicNumber step1 = quotient_copy.multiply(divisor);
		step1.println("step 1");
		DynamicNumber step2 = dividend_integer.subtract(step1);
		
		if(LogicalUtils.getLogicalStatus(step2, new DynamicNumber("0")) == "equal") {
			return quotient_progress;
		}

		if (dividend.getSizeRightOfPoint() > step) {
			step2.getNumber().add(dividend.getNumber().get(dividend.getOrigin() + step));
		} else {
			step2.getNumber().add('0');
		}
		step2.println("step 2");
		

		return longDivide(divisor, step2, quotient_progress, ++step);
	}

	/**
	 * Returns an array of DynamicNumbers.
	 * 
	 * [0] = quotient [1] = remainder
	 * 
	 */
	private static DynamicNumber[] divideInt(DynamicNumber dna, DynamicNumber dnb) {
		DynamicNumber solution = new DynamicNumber("0");
		while (LogicalUtils.getLogicalStatus(dna, dnb) != "false") {
			dna.subtract(dnb);
			solution.add("1");
		}

		return new DynamicNumber[] { solution, dna };
	}
}
