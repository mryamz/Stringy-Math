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

	public static HashMap<String, Character> base90 = new HashMap<>();
	public static HashMap<Character, String> base90_swapped = new HashMap<>();
	
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
	
	static {
		base90.put("0", '0');
		base90.put("1", '1');
		base90.put("2", '2');
		base90.put("3", '3');
		base90.put("4", '4');
		base90.put("5", '5');
		base90.put("6", '6');
		base90.put("7", '7');
		base90.put("8", '8');
		base90.put("9", '9');
		base90.put("10", 'A');
		base90.put("11", 'B');
		base90.put("12", 'C');
		base90.put("13", 'D');
		base90.put("14", 'E');
		base90.put("15", 'F');
		base90.put("16", 'G');
		base90.put("17", 'H');
		base90.put("18", 'I');
		base90.put("19", 'J');
		base90.put("20", 'K');
		base90.put("21", 'L');
		base90.put("22", 'M');
		base90.put("23", 'N');
		base90.put("24", 'O');
		base90.put("25", 'P');
		base90.put("26", 'Q');
		base90.put("27", 'R');
		base90.put("28", 'S');
		base90.put("29", 'T');
		base90.put("30", 'U');
		base90.put("31", 'V');
		base90.put("32", 'W');
		base90.put("33", 'X');
		base90.put("34", 'Y');
		base90.put("35", 'Z');
		base90.put("36", (char) 0xf09f9891);
		base90.put("37", (char) 0xf09f9892);
		base90.put("38", (char) 0xf09f9893);
		base90.put("39", (char) 0xf09f9894);
		base90.put("40", (char) 0xf09f9895);
		base90.put("41", (char) 0xf09f9896);
		base90.put("42", (char) 0xf09f9897);
		base90.put("43", (char) 0xf09f9898);
		base90.put("44", (char) 0xf09f9899);
		base90.put("45", (char) 0xf09f989a);
		base90.put("46", (char) 0xf09f989b);
		base90.put("47", (char) 0xf09f989c);
		base90.put("48", (char) 0xf09f989d);
		base90.put("49", (char) 0xf09f989e);
		base90.put("50", (char) 0xf09f989f);
		base90.put("51", (char) 0xf09f98a0);
		base90.put("52", (char) 0xf09f98a1);
		base90.put("53", (char) 0xf09f98a2);
		base90.put("54", (char) 0xf09f98a3);
		base90.put("55", (char) 0xf09f98a4);
		base90.put("56", (char) 0xf09f98a5);
		base90.put("57", (char) 0xf09f98a6);
		base90.put("58", (char) 0xf09f98a7);
		base90.put("59", (char) 0xf09f98a8);
		base90.put("60", (char) 0xf09f98a9);
		base90.put("61", (char) 0xf09f98aa);
		base90.put("62", (char) 0xf09f98ab);
		base90.put("63", (char) 0xf09f98ac);
		base90.put("64", (char) 0xf09f98ad);
		base90.put("65", (char) 0xf09f98ae);
		base90.put("66", (char) 0xf09f98af);
		base90.put("67", (char) 0xf09f98b0);
		base90.put("68", (char) 0xf09f98b1);
		base90.put("69", (char) 0xf09f98b2);
		base90.put("70", (char) 0xf09f98b3);
		base90.put("71", (char) 0xf09f98b4);
		base90.put("72", (char) 0xf09f98b5);
		base90.put("73", (char) 0xf09f98b6);
		base90.put("74", (char) 0xf09f98b7);
		base90.put("75", (char) 0xf09f98b8);
		base90.put("76", (char) 0xf09f98b9);
		base90.put("77", (char) 0xf09f98ba);
		base90.put("78", (char) 0xf09f98bb);
		base90.put("79", (char) 0xf09f98bc);
		base90.put("80", (char) 0xf09f98bd);
		base90.put("81", (char) 0xf09f98be);
		base90.put("82", (char) 0xf09f98bf);
		base90.put("83", (char) 0xf09f98c0);
		base90.put("84", (char) 0xf09f98c1);
		base90.put("85", (char) 0xf09f98c2);
		base90.put("86", (char) 0xf09f98c3);
		base90.put("87", (char) 0xf09f98c4);
		base90.put("88", (char) 0xf09f98c5);
		base90.put("89", (char) 0xf09f98c6);


		base90_swapped.put('0', "0");
		base90_swapped.put('1', "1");
		base90_swapped.put('2', "2");
		base90_swapped.put('3', "3");
		base90_swapped.put('4', "4");
		base90_swapped.put('5', "5");
		base90_swapped.put('6', "6");
		base90_swapped.put('7', "7");
		base90_swapped.put('8', "8");
		base90_swapped.put('9', "9");
		base90_swapped.put('A', "10");
		base90_swapped.put('B', "11");
		base90_swapped.put('C', "12");
		base90_swapped.put('D', "13");
		base90_swapped.put('E', "14");
		base90_swapped.put('F', "15");
		base90_swapped.put('G', "16");
		base90_swapped.put('H', "17");
		base90_swapped.put('I', "18");
		base90_swapped.put('J', "19");
		base90_swapped.put('K', "20");
		base90_swapped.put('L', "21");
		base90_swapped.put('M', "22");
		base90_swapped.put('N', "23");
		base90_swapped.put('O', "24");
		base90_swapped.put('P', "25");
		base90_swapped.put('Q', "26");
		base90_swapped.put('R', "27");
		base90_swapped.put('S', "28");
		base90_swapped.put('T', "29");
		base90_swapped.put('U', "30");
		base90_swapped.put('V', "31");
		base90_swapped.put('W', "32");
		base90_swapped.put('X', "33");
		base90_swapped.put('Y', "34");
		base90_swapped.put('Z', "35");
		base90_swapped.put((char) 0xf09f9891, "36");
		base90_swapped.put((char) 0xf09f9892, "37");
		base90_swapped.put((char) 0xf09f9893, "38");
		base90_swapped.put((char) 0xf09f9894, "39");
		base90_swapped.put((char) 0xf09f9895, "40");
		base90_swapped.put((char) 0xf09f9896, "41");
		base90_swapped.put((char) 0xf09f9897, "42");
		base90_swapped.put((char) 0xf09f9898, "43");
		base90_swapped.put((char) 0xf09f9899, "44");
		base90_swapped.put((char) 0xf09f989a, "45");
		base90_swapped.put((char) 0xf09f989b, "46");
		base90_swapped.put((char) 0xf09f989c, "47");
		base90_swapped.put((char) 0xf09f989d, "48");
		base90_swapped.put((char) 0xf09f989e, "49");
		base90_swapped.put((char) 0xf09f989f, "50");
		base90_swapped.put((char) 0xf09f98a0, "51");
		base90_swapped.put((char) 0xf09f98a1, "52");
		base90_swapped.put((char) 0xf09f98a2, "53");
		base90_swapped.put((char) 0xf09f98a3, "54");
		base90_swapped.put((char) 0xf09f98a4, "55");
		base90_swapped.put((char) 0xf09f98a5, "56");
		base90_swapped.put((char) 0xf09f98a6, "57");
		base90_swapped.put((char) 0xf09f98a7, "58");
		base90_swapped.put((char) 0xf09f98a8, "59");
		base90_swapped.put((char) 0xf09f98a9, "60");
		base90_swapped.put((char) 0xf09f98aa, "61");
		base90_swapped.put((char) 0xf09f98ab, "62");
		base90_swapped.put((char) 0xf09f98ac, "63");
		base90_swapped.put((char) 0xf09f98ad, "64");
		base90_swapped.put((char) 0xf09f98ae, "65");
		base90_swapped.put((char) 0xf09f98af, "66");
		base90_swapped.put((char) 0xf09f98b0, "67");
		base90_swapped.put((char) 0xf09f98b1, "68");
		base90_swapped.put((char) 0xf09f98b2, "69");
		base90_swapped.put((char) 0xf09f98b3, "70");
		base90_swapped.put((char) 0xf09f98b4, "71");
		base90_swapped.put((char) 0xf09f98b5, "72");
		base90_swapped.put((char) 0xf09f98b6, "73");
		base90_swapped.put((char) 0xf09f98b7, "74");
		base90_swapped.put((char) 0xf09f98b8, "75");
		base90_swapped.put((char) 0xf09f98b9, "76");
		base90_swapped.put((char) 0xf09f98ba, "77");
		base90_swapped.put((char) 0xf09f98bb, "78");
		base90_swapped.put((char) 0xf09f98bc, "79");
		base90_swapped.put((char) 0xf09f98bd, "80");
		base90_swapped.put((char) 0xf09f98be, "81");
		base90_swapped.put((char) 0xf09f98bf, "82");
		base90_swapped.put((char) 0xf09f98c0, "83");
		base90_swapped.put((char) 0xf09f98c1, "84");
		base90_swapped.put((char) 0xf09f98c2, "85");
		base90_swapped.put((char) 0xf09f98c3, "86");
		base90_swapped.put((char) 0xf09f98c4, "87");
		base90_swapped.put((char) 0xf09f98c5, "88");
		base90_swapped.put((char) 0xf09f98c6, "89");
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
