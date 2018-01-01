package test;

import arithmetic.numbers.DynamicNumber;
import arithmetic.utils.ArithmeticUtils;

public class Main {
	public static void main(String... strings) {
//		DynamicNumber number = new DynamicNumber("1007857").multiply("-4375375373753.85");
		DynamicNumber number = new DynamicNumber("12.34").multiply("56.78");
		number.println();
		
//		for(int i = 36; i < 90; i++) {
//			System.out.println("base90.put(\"" + i + "\", "+ "(char) 0x" + Integer.toHexString(0xF09F9891 + (i - 36)) +");");
//		}
//		
//		for(int i = 36; i < 90; i++) {
//			System.out.println("base90_swapped.put((char) 0x" + Integer.toHexString(0xF09F9891 + (i - 36)) +", \"" + i+ "\");");
//		}
//		
		System.out.println(ArithmeticUtils.base90);
		
	}
}
