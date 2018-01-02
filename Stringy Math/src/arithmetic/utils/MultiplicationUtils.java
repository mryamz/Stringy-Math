package arithmetic.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import arithmetic.numbers.DynamicNumber;
import general.utils.ScratchWork;

public class MultiplicationUtils {

	/**
	 * 
	 * This is used! But, I'm glad I did not delete it because it a long time to
	 * type :) #WORK #MAXEFFORT
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
		dna.formatNumber();
		dnb.formatNumber();

		int decicount = dna.getSizeRightOfPoint() + dnb.getSizeRightOfPoint();

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

		dna.formatNumber();
		dnb.formatNumber();

		/* solution start non-negative integers */

		// 1.) build table start

		boolean isDnaBigger = false;
		if (dna.getNumber().size() > dnb.getNumber().size()) {
			isDnaBigger = true;
		}
		int maxNumberSize = Math.max(dna.getNumber().size(), dnb.getNumber().size());
		int minNumberSize = Math.min(dna.getNumber().size(), dnb.getNumber().size());

		char[][] mathTable = new char[2][maxNumberSize];
		int delta = isDnaBigger ? dna.getNumber().size() - dnb.getNumber().size() : dnb.getNumber().size() - dna.getNumber().size();
		for (int i = 0; i < mathTable.length; i++) {
			for (int j = 0; j < mathTable[i].length; j++) {
				mathTable[i][j] = '$';
			}
		}
		if (isDnaBigger) {
			for (int i = 0; i < maxNumberSize; i++) {
				mathTable[0][i] = dna.getNumber().get(i);
			}
			for (int i = delta; i < maxNumberSize; i++) {
				mathTable[1][i] = dnb.getNumber().get(i - delta);

			}
		} else {
			for (int i = 0; i < maxNumberSize; i++) {
				mathTable[0][i] = dnb.getNumber().get(i);
			}

			for (int i = delta; i < maxNumberSize; i++) {
				mathTable[1][i] = dna.getNumber().get(i - delta);
			}
		}

		// 1.) build table | end

		// 2.) pairing the right cyber-data | start

		// creating a list of lists of character type
		ArrayList<ArrayList<Character>> answerTable = new ArrayList<ArrayList<Character>>();

		// used for properly pairing the multiplications from the smaller to the
		// bigger
		int offset = 0;

		// used for pivoting between the proper values
		for (int i = maxNumberSize - 1; i > -1; i--) {

			// adds a new list for building the answers in accordance to offset.
			// "Makin' 'em babies righ'?"-Tavi
			if (i == maxNumberSize - 1) {
				answerTable.add(new ArrayList<>());
			}

			// part of pair
			char a = mathTable[0][i];
			// part of pair
			char b = mathTable[1][maxNumberSize - 1 - offset];

			// product of the pairs
			String product = times(a, b);

			// allows us to grab the start and last elements from the array

			// build an end row of the semi-built answer table and resetting the
			// loop if offset isn't at termination length.
			if (i == 0) {

				// build an end col.
				answerTable.get(offset).add(ArithmeticUtils.base90.get(product));

				// go to next column in the smaller table.
				offset++;

				// resets loop
				i = maxNumberSize;

				// checks for termination
				if (offset == minNumberSize) {
					break;
				}
			} else {
				// Only multiplying
				// TODO: multiply then add

				// Given, for first iteration:
				// productArr = {3, 5}
				// answerTable.get(0) = 5

				answerTable.get(offset).add(ArithmeticUtils.base90.get(product));
			}
		}
		// 2.) pairing the right cyber-data | end

		// 3.) Converting base 90 into base 10 by implementing the carry-system
		for (int i = 0; i < answerTable.size(); i++) {
			String[] bloatedVals = new String[answerTable.get(i).size()];
			for (int j = 0; j < answerTable.get(i).size(); j++) {
				char val = answerTable.get(i).get(j);
				String bloatedVal = ArithmeticUtils.base90_swapped.get(val);
				bloatedVals[j] = bloatedVal;
			}

			for (int j = 0; j < bloatedVals.length; j++) {
				if (j < bloatedVals.length - 1) {
					if (bloatedVals[j].length() == 1) {
						continue;
					}

					byte a = Byte.parseByte(Character.toString(bloatedVals[j].charAt(0)));
					char b = bloatedVals[j].charAt(1);
					byte c = Byte.parseByte(bloatedVals[j + 1]);

					byte d = (byte) (a + c);

					bloatedVals[j] = Character.toString(b);
					bloatedVals[j + 1] = Byte.toString(d);

				} else {
					for (int k = 0; k < bloatedVals.length; k++) {
						if (k < bloatedVals.length - 1) {
							answerTable.get(i).set(k, bloatedVals[k].charAt(0));
						} else {
							answerTable.get(i).remove(k);
							for (int m = bloatedVals[k].length() - 1; m > -1; m--) {
								answerTable.get(i).add(bloatedVals[k].charAt(m));
							}
						}
					}
				}
			}

			for (int j = 0; j < i; j++) {
				answerTable.get(i).add(0, '0');
			}
		}

		// 4.) add answer table
		DynamicNumber sum = new DynamicNumber("0");
		for (int i = 0; i < answerTable.size(); i++) {
			Collections.reverse(answerTable.get(i));
			DynamicNumber row = new DynamicNumber(answerTable.get(i));
			sum.add(row);
		}

		/* solution end non-negative integers */

		if (decicount > 0) {
			int index = sum.getNumber().size() - decicount;
			// inflate number with more zeros if index is less than zero
			if (index < 0) {
				index = -index;
				for (int i = 0; i < index; i++) {
					sum.getNumber().add(0, '0');
				}
				index = 0;
			}
			sum.getNumber().add(index, '.');
		}

		if (isSigned) {
			sum.getNumber().add(0, '-');
		}

		if (ScratchWork.getInstance().isLogging()) {
			ScratchWork.getInstance().log("_________Math Table_________", true);
			/// ------------ Add work to Debug ------------
			for (int i = 0; i < mathTable.length; i++) {
				for (int j = 0; j < mathTable[i].length; j++) {
					ScratchWork.getInstance().log(mathTable[i][j] + "-", false);
				}
				ScratchWork.getInstance().log("", true);
			}
			// ------------ Add work to Deug ------------
			ScratchWork.getInstance().log("__________Answer Table_________", true);
			for (int i = 0; i < answerTable.size(); i++) {
				for (int j = answerTable.get(i).size() - 1; j > -1; j--) {
					ScratchWork.getInstance().log(answerTable.get(i).get(j) + " ", false);
				}
				ScratchWork.getInstance().log("", true);
			}
		}

		return sum.getNumber();
	}

}
