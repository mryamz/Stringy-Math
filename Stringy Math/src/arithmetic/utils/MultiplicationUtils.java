package arithmetic.utils;

import java.util.List;

import arithmetic.numbers.DynamicNumber;
import logical.utils.LogicalUtils;

public class MultiplicationUtils {

	@SuppressWarnings("unused")
	/**
	 * 
	 * This is unused! But, I'm not deleting it because it a long time to type
	 * :) #WORK #MAXEFFORT
	 */
	private static String times(char a, char b) {
		String value = "NULL";

		// a @ 0
		if (a == '0' && b == '0') {
			value = "0";
		}

		if (a == '0' && b == '1') {
			value = "0";
		}

		if (a == '0' && b == '2') {
			value = "0";
		}

		if (a == '0' && b == '3') {
			value = "0";
		}

		if (a == '0' && b == '4') {
			value = "0";
		}

		if (a == '0' && b == '5') {
			value = "0";
		}

		if (a == '0' && b == '6') {
			value = "0";
		}

		if (a == '0' && b == '7') {
			value = "0";
		}

		if (a == '0' && b == '8') {
			value = "0";
		}

		if (a == '0' && b == '9') {
			value = "0";
		}

		// a @ 1
		if (a == '1' && b == '0') {
			value = "0";
		}

		if (a == '1' && b == '1') {
			value = "1";
		}

		if (a == '1' && b == '2') {
			value = "2";
		}

		if (a == '1' && b == '3') {
			value = "3";
		}

		if (a == '1' && b == '4') {
			value = "4";
		}

		if (a == '1' && b == '5') {
			value = "5";
		}

		if (a == '1' && b == '6') {
			value = "6";
		}

		if (a == '1' && b == '7') {
			value = "7";
		}

		if (a == '1' && b == '8') {
			value = "8";
		}

		if (a == '1' && b == '9') {
			value = "9";
		}

		// a @ 2
		if (a == '2' && b == '0') {
			value = "0";
		}

		if (a == '2' && b == '1') {
			value = "2";
		}

		if (a == '2' && b == '2') {
			value = "4";
		}

		if (a == '2' && b == '3') {
			value = "6";
		}

		if (a == '2' && b == '4') {
			value = "8";
		}

		if (a == '2' && b == '5') {
			value = "10";
		}

		if (a == '2' && b == '6') {
			value = "12";
		}

		if (a == '2' && b == '7') {
			value = "14";
		}

		if (a == '2' && b == '8') {
			value = "16";
		}

		if (a == '2' && b == '9') {
			value = "18";
		}

		// a @ 3
		if (a == '3' && b == '0') {
			value = "0";
		}

		if (a == '3' && b == '1') {
			value = "3";
		}

		if (a == '3' && b == '2') {
			value = "6";
		}

		if (a == '3' && b == '3') {
			value = "9";
		}

		if (a == '3' && b == '4') {
			value = "12";
		}

		if (a == '3' && b == '5') {
			value = "15";
		}

		if (a == '3' && b == '6') {
			value = "18";
		}

		if (a == '3' && b == '7') {
			value = "21";
		}

		if (a == '3' && b == '8') {
			value = "24";
		}

		if (a == '3' && b == '9') {
			value = "27";
		}

		// a @ 4
		if (a == '4' && b == '0') {
			value = "0";
		}

		if (a == '4' && b == '1') {
			value = "4";
		}

		if (a == '4' && b == '2') {
			value = "8";
		}

		if (a == '4' && b == '3') {
			value = "12";
		}

		if (a == '4' && b == '4') {
			value = "16";
		}

		if (a == '4' && b == '5') {
			value = "20";
		}

		if (a == '4' && b == '6') {
			value = "24";
		}

		if (a == '4' && b == '7') {
			value = "28";
		}

		if (a == '4' && b == '8') {
			value = "32";
		}

		if (a == '4' && b == '9') {
			value = "36";
		}

		// a @ 5
		if (a == '5' && b == '0') {
			value = "0";
		}

		if (a == '5' && b == '1') {
			value = "5";
		}

		if (a == '5' && b == '2') {
			value = "10";
		}

		if (a == '5' && b == '3') {
			value = "15";
		}

		if (a == '5' && b == '4') {
			value = "20";
		}

		if (a == '5' && b == '5') {
			value = "25";
		}

		if (a == '5' && b == '6') {
			value = "30";
		}

		if (a == '5' && b == '7') {
			value = "35";
		}

		if (a == '5' && b == '8') {
			value = "40";
		}

		if (a == '5' && b == '9') {
			value = "45";
		}

		// a @ 6
		if (a == '6' && b == '0') {
			value = "0";
		}

		if (a == '6' && b == '1') {
			value = "6";
		}

		if (a == '6' && b == '2') {
			value = "12";
		}

		if (a == '6' && b == '3') {
			value = "18";
		}

		if (a == '6' && b == '4') {
			value = "24";
		}

		if (a == '6' && b == '5') {
			value = "30";
		}

		if (a == '6' && b == '6') {
			value = "36";
		}

		if (a == '6' && b == '7') {
			value = "42";
		}

		if (a == '6' && b == '8') {
			value = "48";
		}

		if (a == '6' && b == '9') {
			value = "54";
		}

		// a @ 7
		if (a == '7' && b == '0') {
			value = "0";
		}

		if (a == '7' && b == '1') {
			value = "7";
		}

		if (a == '7' && b == '2') {
			value = "14";
		}

		if (a == '7' && b == '3') {
			value = "21";
		}

		if (a == '7' && b == '4') {
			value = "28";
		}

		if (a == '7' && b == '5') {
			value = "35";
		}

		if (a == '7' && b == '6') {
			value = "42";
		}

		if (a == '7' && b == '7') {
			value = "49";
		}

		if (a == '7' && b == '8') {
			value = "56";
		}

		if (a == '7' && b == '9') {
			value = "63";
		}

		// a @ 8
		if (a == '8' && b == '0') {
			value = "0";
		}

		if (a == '8' && b == '1') {
			value = "8";
		}

		if (a == '8' && b == '2') {
			value = "16";
		}

		if (a == '8' && b == '3') {
			value = "24";
		}

		if (a == '8' && b == '4') {
			value = "32";
		}

		if (a == '8' && b == '5') {
			value = "40";
		}

		if (a == '8' && b == '6') {
			value = "48";
		}

		if (a == '8' && b == '7') {
			value = "56";
		}

		if (a == '8' && b == '8') {
			value = "64";
		}

		if (a == '8' && b == '9') {
			value = "72";
		}

		// a @ 9
		if (a == '9' && b == '0') {
			value = "0";
		}

		if (a == '9' && b == '1') {
			value = "9";
		}

		if (a == '9' && b == '2') {
			value = "18";
		}

		if (a == '9' && b == '3') {
			value = "27";
		}

		if (a == '9' && b == '4') {
			value = "36";
		}

		if (a == '9' && b == '5') {
			value = "45";
		}

		if (a == '9' && b == '6') {
			value = "54";
		}

		if (a == '9' && b == '7') {
			value = "63";
		}

		if (a == '9' && b == '8') {
			value = "72";
		}

		if (a == '9' && b == '9') {
			value = "81";
		}

		if (value == "NULL") {
			System.err.println("Cannot Perform Operation with: a='" + a + "', b='" + b + "'\nThe expression \"" + a + " times " + b + "\" cannot be performed.\n");
		}

		return value;
	}

	public static List<Character> multiply(DynamicNumber dna, DynamicNumber dnb) {
		DynamicNumber solution = new DynamicNumber("0");

		boolean isSigned = false;

		if (dna.getNumber().contains('-') && dnb.getNumber().contains('-')) {
			isSigned = false;
		}

		if (dna.getNumber().contains('-') && !dnb.getNumber().contains('-')) {
			isSigned = true;
		}

		if (!dna.getNumber().contains('-') && dnb.getNumber().contains('-')) {
			isSigned = true;
		}

		dna.getNumber().remove(Character.valueOf('-'));
		dnb.getNumber().remove(Character.valueOf('-'));
		dna.getNumber().remove(Character.valueOf('.'));
		dnb.getNumber().remove(Character.valueOf('.'));
		
		solution = timesInts(dna, dnb);
		
		if(isSigned) {
			solution.getNumber().add(0, '-');
		}

		return solution.getNumber();
	}

	private static DynamicNumber timesInts(DynamicNumber dna, DynamicNumber dnb) {
		DynamicNumber solution = new DynamicNumber("0");

		for (DynamicNumber i = new DynamicNumber("0"); LogicalUtils.getLogicalStatus(dnb, i) == "true"; i.add("1")) {
			solution.add(dna);
		}

		return solution;
	}

}
