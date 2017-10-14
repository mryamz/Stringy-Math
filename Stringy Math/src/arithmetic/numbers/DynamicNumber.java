package arithmetic.numbers;

import java.util.ArrayList;
import java.util.List;

import arithmetic.utils.AddUtils;
import arithmetic.utils.DivideUtils;
import arithmetic.utils.MultiplicationUtils;
import arithmetic.utils.SubtractUtils;

public final class DynamicNumber {
	
	public static final DynamicNumber ZERO = new DynamicNumber("0");

	private List<Character> number = new ArrayList<>();

	private int sizeRightOfPoint;
	private int sizeLeftOfPoint;
	private int origin;

	public DynamicNumber(DynamicNumber number) {
		this.number = new ArrayList<>(number.getNumber());
		this.sizeLeftOfPoint = number.sizeLeftOfPoint;
		this.sizeRightOfPoint = number.sizeRightOfPoint;
		calculateSizes();
	}

	public DynamicNumber(String value) {
		for (int i = 0; i < value.length(); i++) {
			number.add(value.charAt(i));
		}
		calculateSizes();
	}

	public DynamicNumber(List<Character> number) {
		this.number = number;
		calculateSizes();
	}

	public void calculateSizes() {
		sizeRightOfPoint = 0;
		sizeLeftOfPoint = 0;
		if (number.contains('.')) {
			origin = number.indexOf('.');
			for (int i = origin + 1; i < number.size(); i++) {
				sizeRightOfPoint++;
			}

			for (int i = origin; i > 0; i--) {
				sizeLeftOfPoint++;
			}
		} else {
			sizeRightOfPoint = 0;
			sizeLeftOfPoint = number.size();
			origin = number.size() - 1;
		}

		if (number.contains('.') && sizeRightOfPoint == 0) {
			number.remove(number.size() - 1);
		}
	}

	public DynamicNumber add(String value) {
		number = AddUtils.add(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}

	public DynamicNumber add(DynamicNumber value) {
		number = AddUtils.add(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}

	public DynamicNumber add(List<Character> value) {
		number = AddUtils.add(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}

	public DynamicNumber subtract(String value) {
		number = SubtractUtils.subtract(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}

	public DynamicNumber subtract(DynamicNumber value) {
		number = SubtractUtils.subtract(this, new DynamicNumber(value), '\0');
		calculateSizes();
		return this;
	}

	public DynamicNumber multiply(String value) {
		number = MultiplicationUtils.multiply(this, new DynamicNumber(value));
		calculateSizes();
		return this;
	}

	public DynamicNumber multiply(DynamicNumber value) {
		number = MultiplicationUtils.multiply(this, new DynamicNumber(value));
		calculateSizes();
		return this;
	}

	public DynamicNumber divide(String value) {
		number = DivideUtils.divide(this, new DynamicNumber(value), 0, new StringBuilder());
		calculateSizes();
		return this;
	}

	public List<Character> getNumber() {
		return number;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Character character : number) {
			sb.append(character);
		}
		return sb.toString();
	}

	public void println(Object... optional_tag) {
		String names = "";
		for (Object object : optional_tag) {
			names += "TAG:" + object.toString();
		}
		System.out.println(names.isEmpty() ? "Value=" + toString() : "Value of " + names + " = " + toString());
	}

	public int getSizeLeftOfPoint() {
		return sizeLeftOfPoint;
	}

	public int getOrigin() {
		return origin;
	}

	public int getSizeRightOfPoint() {
		return sizeRightOfPoint;
	}
	
	public void placeDecimalPointAt(int index) {
		getNumber().remove(Character.valueOf('.'));
		getNumber().add(index, '.');
	}
}
